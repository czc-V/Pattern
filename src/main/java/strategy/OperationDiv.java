package strategy;

import staticFactory.Operation;

public class OperationDiv implements Stragegy {

    @Override
    public int operate(int a, int b) {
        return a/b;
    }
}
