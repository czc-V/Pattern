package chainOfResponsibility;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/7
 * @description：
 */

@HandlerAnnotation(offset = 3)
public class GeneralManager extends CommonManager{

    public GeneralManager(String name){
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType().equals("请假")){
            System.out.println(name+",请假 "+request.getRequestNum()+" 被批准");
        }else if(request.getRequestType().equals("加薪")&&request.getRequestNum()<=500){
            System.out.println(name+",加薪 "+request.getRequestNum()+" 被批准");
        }else if(request.getRequestType().equals("加薪")){
            System.out.println(name+",加薪 "+request.getRequestNum()+" 再考虑一下");
        }else{
            if(superior!=null){
                superior.handleRequest(request);
            }else{
                System.out.println("该请求类型无人处理");
            }

        }
    }
}
