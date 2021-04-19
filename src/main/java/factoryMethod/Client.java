package factoryMethod;

/*
chengzhichao
2021/4/20
工厂方法模式：工厂方法克服了简单工厂模式违背开闭原则的缺点，又保持了封装对象创建过程的优点。
使一个类的实例化延迟到其子类。
 */


public class Client {

    public static void main(String[] args){

        Factory factory=new AddFactory();
        Operation oper= factory.createOperation();
        oper.a=1;
        oper.b=3;
        System.out.println("1+3="+oper.getResult());

    }




}
