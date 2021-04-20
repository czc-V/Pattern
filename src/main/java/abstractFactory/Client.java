package abstractFactory;


public class Client {

    public static void main(String[] args){

        //获取形状工厂
        AbstractFactory shapeFactory=FactoryProducer.getFactory("SHAPE");

        //通过形状工厂生产形状
        Shape shape1=shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2=shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3=shapeFactory.getShape("SQUARE");
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory=FactoryProducer.getFactory("COLOR");
        Color color1=colorFactory.getColor("RED");
        color1.fill();

        Color color2=colorFactory.getColor("GREEN");
        color2.fill();

        Color color3=colorFactory.getColor("BLUE");
        color3.fill();


        //利用反射机制优化抽象工厂
        AbstractFactory factory=ReflectFactoryProducer.getFactory("abstractFactory.ColorFactory");
        Color color=factory.getColor("RED");
        color.fill();


    }


}
