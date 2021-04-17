package proxy.stati;

/*
chengzhichao
2021.4.7
代理模式测试类
 */

import proxy.Subject;

public class Client {


    public static void main(String[] args){
        Proxy proxy=new Proxy();
        proxy.sendFlowers();
        proxy.sendDolls();
    }

}
