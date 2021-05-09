package decorator;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/9
 * @description：
 */

public class ShoesWearDecorator extends WearDecorator{

    public ShoesWearDecorator(Wear wear){
        super(wear);
    }

    @Override
    public void wearSomething() {
        wear.wearSomething();
        setComponent();
    }

    public void setComponent(){
        System.out.println("穿鞋子");
    }

}
