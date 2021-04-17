package staticFactory;

/*
chengzhichao
2021/4/18
简单工厂模式（静态工厂模式）
 */

public class OperationAdd extends Operation{
    @Override
    public double getResult() {
        return a+b;
    }
}
