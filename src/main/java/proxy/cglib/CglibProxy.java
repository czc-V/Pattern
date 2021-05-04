package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 程智超
 */
public class CglibProxy implements MethodInterceptor {


    /**
     * 生成CGLIB代理对象
     * @param cls
     * @return
     */
    public Object getProxy(Class cls){
        //CGLIB enhancer增强类对象
        Enhancer enhancer=new Enhancer();
        //设置增强类型
        enhancer.setSuperclass(cls);
        //定义代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor方法
        enhancer.setCallback(this);
        //生成并返回代理对象
        return enhancer.create();

    }

    /**
     * @param proxy
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用真实对象前");
        //CGLIB反射调用真实对象方法
        Object object=methodProxy.invokeSuper(proxy,args);
        System.out.println("调用真实对象后");

        return object;
    }
}
