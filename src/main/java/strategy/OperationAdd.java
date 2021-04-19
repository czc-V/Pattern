package strategy;

/*
chengzhichao
2021/4/18
简单工厂模式（静态工厂模式）
 */

import staticFactory.Operation;

public class OperationAdd implements Stragegy {

    @Override
    public int operate(int a, int b) {
        return a+b;
    }
}
