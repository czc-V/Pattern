package chainOfResponsibility;




import org.springframework.util.CollectionUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/7
 * @description：处理链管理类
 */

public class HandlerChain {

    //责任链中的处理器优先级排序集合
    private List<Integer> offsets=new ArrayList<>();

    //责任链的处理类集合
    private final Map<Integer,CommonManager> handlerList=new LinkedHashMap<>();

    public HandlerChain(String packageName){
        try{
            getInstance(packageName);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    /**
     * @param packageName
     * @throws IOException
     */
    public void getInstance(String packageName) throws IOException{
        List<Class<?>> allClass = getAllClass(packageName);
        if (CollectionUtils.isEmpty(allClass)) {
            return;
        }
        // 获取处理器优先级集合
        offsets = allClass.stream().map(t -> t.getAnnotation(HandlerAnnotation.class).offset()).sorted().collect(Collectors.toList());
        // 通过反射机制来生成处理器实例
        allClass.forEach(clazz -> {
            HandlerAnnotation annotation = clazz.getAnnotation(HandlerAnnotation.class);
            try {
                handlerList.put(annotation.offset(), (CommonManager) clazz.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        // 指定处理器的下一个处理器实例
        handlerList.forEach( (k, v) -> {
            int size = offsets.size() - 1;
            int index = offsets.indexOf(k);
            if (size > index) {
                v.setSuperior(handlerList.get(offsets.get(index + 1)));
            }
        });

    }


    private List<Class<?>> getAllClass(String packageName) throws IOException{
        List<Class<?>> list = new ArrayList<>();
        // 获取类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        while (resources.hasMoreElements()) {
            File file = new File(resources.nextElement().getFile());
            // 获取当前文件夹下的所有文件信息
            File[] files = file.listFiles();
            // 获取类的全限类名
            Arrays.asList(files).forEach( f -> {
                if (f.getName().endsWith(".class")) {
                    try {
                        String s = f.getName();
                        String[] split = s.split("\\.");
                        list.add(Class.forName(packageName + "." + split[0]));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        return list;

    }


    /**
     * @param request
     * 处理器执行类（总是从链首开始执行）
     */
    public void handler(Request request){
        handlerList.get(offsets.get(0)).handleRequest(request);
    }

}
