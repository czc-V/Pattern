package chainOfResponsibility;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/7
 * @description：模拟发起请求
 */

public class Client {

    public static void main(String[] args) {
        Manger manger=new Manger("经理");
        Majordomo majordomo=new Majordomo("总监");
        GeneralManager generalManager=new GeneralManager("总经理");

        //设置责任链中上下级关系
        manger.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request request1=new Request();
        request1.setRequestType("请假");
        request1.setRequestNum(2);
        manger.handleRequest(request1);

        Request request2=new Request();
        request2.setRequestType("请假");
        request2.setRequestNum(5);
        manger.handleRequest(request2);

        Request request3=new Request();
        request3.setRequestType("请假");
        request3.setRequestNum(10);
        manger.handleRequest(request3);

        Request request4=new Request();
        request4.setRequestType("加薪");
        request4.setRequestNum(500);
        manger.handleRequest(request4);

        Request request5=new Request();
        request5.setRequestType("加薪");
        request5.setRequestNum(1000);
        manger.handleRequest(request5);

        Request request6=new Request();
        request6.setRequestType("升职");
        request6.setRequestNum(1);
        manger.handleRequest(request6);

    }

}
