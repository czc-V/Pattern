package proxy.dynamic;

import java.lang.reflect.Method;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/5
 * @description：拦截器接口
 */
public interface Interceptor {


    /**
     * before方法返回boolean值，在真实对象前调用。当返回为true时，返回真实对象的方法，返回为false，调用around方法。
     * @param proxy（代理对象）
     * @param target（目标对象）
     * @param method（方法）
     * @param args（运行方法参数）
     * @return
     */
    public boolean before(Object proxy, Object target, Method method,Object[] args);


    /**
     * before方法返回false的情况下，调用around方法
     * @param proxy
     * @param target
     * @param method
     * @param args
     */
    public void around(Object proxy, Object target, Method method,Object[] args);


    /**
     * 在反射真实对象方法或around方法执行后，调用after方法
     * @param proxy
     * @param target
     * @param method
     * @param args
     */
    public void after(Object proxy, Object target, Method method,Object[] args);


}
