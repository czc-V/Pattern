package chainOfResponsibility;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/6
 * @description：责任链第一层链路，经理。
 */

public class Manger extends CommonManager{

    public Manger(String name){
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType().equals("请假")&&request.getRequestNum()<=2){
            System.out.println(name+"请假 "+request.getRequestNum()+" 被批准");
        }else{
            if(superior!=null){
                superior.handleRequest(request);
            }
        }
    }
}
