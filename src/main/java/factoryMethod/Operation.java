package factoryMethod;

/*
chengzhichao
2021/4/18
简单工厂模式（静态工厂）：运算抽象父类，封装公共属性和方法。
 */

public abstract class Operation {

    public double a;
    public double b;

    public abstract double getResult();

}
