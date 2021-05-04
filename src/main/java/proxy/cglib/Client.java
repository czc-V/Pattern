package proxy.cglib;

public class Client {

    public static void main(String[] args) {
        CglibProxy proxy=new CglibProxy();
        DoSomethingReal dsr=(DoSomethingReal) proxy.getProxy(DoSomethingReal.class);
        dsr.sendDolls("神奇");
        dsr.sendFlowers("神奇");

    }

}
