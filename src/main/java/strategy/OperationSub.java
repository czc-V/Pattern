package strategy;

import staticFactory.Operation;

public class OperationSub implements Stragegy {

    @Override
    public int operate(int a, int b) {
        return a-b;
    }
}
