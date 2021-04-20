package abstractFactory;

/*
chengzhichao
2021/4/20
利用反射优化抽象工厂
 */

public class ReflectFactoryProducer {

    public static AbstractFactory getFactory(String choice){
        try{
            System.out.println(choice);
            Class choice1=Class.forName("choice");
            Object obj=choice1.newInstance();
            return (AbstractFactory) obj;
        }catch (ClassNotFoundException e){
            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;

    }


}
