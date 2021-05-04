package proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 程智超
 * 2021/4/8
 * 代理模式动态代理动态处理器
 */
public class DynamicProxy {

    private Object object;

    public DynamicProxy(final Object object){
        this.object=object;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理从真实手里拿过花！");
                        
                        //执行目标对象方法
                        Object o= method.invoke(object,args);
                        
                        System.out.println("你好，我住隔壁我姓王！");
                        return o;
                        

                    }
                }
        );
    }

    /**
     * 另一种方案，采用静态方法实现。
     * @param object
     * @return
     */
    public static Object getProxyInstance(Object object){
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理从真实手里拿过花！");

                        //执行目标对象方法
                        Object o= method.invoke(object,args);

                        System.out.println("你好，我住隔壁我姓王！");
                        return o;
                    }
                }
        );
    }

}
