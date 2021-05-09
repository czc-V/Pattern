package decorator;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/9
 * @description：
 */

public class WearPants implements Wear{


    @Override
    public void wearSomething() {
        System.out.println("穿裤子");
    }
}
