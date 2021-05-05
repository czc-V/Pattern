package proxy.dynamic;

import java.lang.reflect.Method;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/5
 * @description：
 */

public class MyInterceptor implements Interceptor{

    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {

        System.out.println("进入拦截器before方法");
        //不反射被代理对象原有方法，进入around方法
        return false;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {

        System.out.println("进入拦截器around方法");



    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {

        System.out.println("进入拦截器after方法");

    }
}
