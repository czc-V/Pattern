package proxy.stati;



/*
chengzhichao
2021.4.7
代码模式中代理
 */

import proxy.Real;
import proxy.Subject;


public class Proxy implements Subject {

    Real real=null;

    public Proxy(){
        this.real=new Real();
    }

    @Override
    public void sendFlowers() {
        System.out.println("代理从真实拿过花！");
        real.sendFlowers();
        System.out.println("你好，我住隔壁我姓王！");
    }

    @Override
    public void sendDolls() {
        System.out.println("代理人拿过玩偶！");
        real.sendDolls();
        System.out.println("你好，我住隔壁我姓王！");
    }
}
