package proxy.cglib;

import proxy.Subject;

public class CglibSubject implements Subject {
    @Override
    public void sendFlowers() {
        System.out.println("cglib送花");

    }

    @Override
    public void sendDolls() {
        System.out.println("cglib送玩偶");

    }

    public void sendRing(){
        System.out.println("cglib送戒指");

    }

}
