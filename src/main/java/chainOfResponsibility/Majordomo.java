package chainOfResponsibility;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/7
 * @description：
 */

public class Majordomo extends CommonManager{

    public Majordomo(String name){
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType().equals("请假")&&request.getRequestNum()<=5){
            System.out.println(name+",请假 "+request.getRequestNum()+" 被批准");
        }else{
            if(superior!=null){
                superior.handleRequest(request);
            }
        }
    }
}
