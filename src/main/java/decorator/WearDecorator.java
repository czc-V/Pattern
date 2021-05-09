package decorator;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/9
 * @description：
 */

public abstract class WearDecorator implements Wear{

    protected Wear wear;

    public WearDecorator(Wear wear){
        this.wear=wear;
    }

    public void WearNext(){
        wear.wearSomething();
    }


}
