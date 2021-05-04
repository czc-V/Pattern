package proxy.dynamic;

import proxy.Real;
import proxy.Subject;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/5
 * @description：模拟客户端调用代理对象
 */
public class Client {

    public static void main(String[] args) {
        ProxyObject proxyObject=new ProxyObject();
        Subject subject=(Subject) proxyObject.bind(new Real());
        subject.sendFlowers();
        subject.sendDolls();
    }

}
