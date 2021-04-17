package proxy.dynamic;

/*
chengzhichao
2021/4/8
代理模式动态代理测试类
 */

import proxy.Real;
import proxy.Subject;

public class DynamicProxyHandler {

    public static void main(String[] args){

        Subject subject=new Real();
        System.out.println(subject.getClass());

        //给目标对象创建代理对象
        Subject proxy=(Subject) new DynamicProxy(subject).getProxyInstance();

        System.out.println(proxy.getClass());

        proxy.sendFlowers();
        proxy.sendDolls();


    }

}
