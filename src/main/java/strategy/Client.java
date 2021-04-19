package strategy;

public class Client {

    public static void main(String[] args){
        Context context=new Context(new OperationAdd());
        System.out.println("1+3="+context.executeStrategy(1,3));
    }

}
