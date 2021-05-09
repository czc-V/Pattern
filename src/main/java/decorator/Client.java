package decorator;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/9
 * @description：
 */

public class Client {

    public static void main(String[] args) {
        Wear wear=new WearPants();
        WearDecorator wearDecorator=new ShoesWearDecorator(new WearPants());

        System.out.println("单独穿裤子--------");
        wear.wearSomething();

        System.out.println("穿完鞋子穿裤子--------");
        wearDecorator.wearSomething();
    }

}
