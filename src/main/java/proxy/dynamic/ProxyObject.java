package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 程智超
 * 2021/5/4
 * 代理模式：为真实对象生成代理对象
 */
public class ProxyObject implements InvocationHandler {

    private Object target=null;

    /**
     * 代理模式第一步：建立代理模式和真实对象的关系。
     * @param object
     * @return
     */
    public Object bind(Object object){
        target=object;

        /*
        第一个是类加载器，采用对象本身的类加载器。
        第二个是把生成的动态代理对象挂在哪个接口下，本处挂在对象本身实现的接口下。
        第三个是定义实现接口方法逻辑的代理类，本处this表示当前对象，必须实现InvocationHandler接口中的Invoker方法，它就是代理逻辑方法的现实方法。
         */
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(),this);
    }

    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }
}
