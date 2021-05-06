package chainOfResponsibility;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/6
 * @description：责任链模式
 * 责任链模式模拟实现管理者之间的传递关系
 */

public abstract class CommonManager {

    protected String name;

    //责任链中当前对象的上级
    protected CommonManager superior;

    public CommonManager(String name){
        this.name=name;
    }

    //处理请求
    abstract public void handleRequest(Request request);

    /**
     * @param manager
     * 设置当前责任对象的上级
     */
    public void setSuperior(CommonManager manager){
        superior=manager;
    }



}
