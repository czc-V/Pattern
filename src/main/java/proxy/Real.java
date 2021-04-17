package proxy;

/*
chengzhichao
2021.4.7
代理模式中真实提供服务对象
 */

import proxy.Subject;

public class Real implements Subject {


    @Override
    public void sendFlowers() {
        System.out.println("送花！");
    }

    @Override
    public void sendDolls() {
        System.out.println("玩偶！");
    }
}
