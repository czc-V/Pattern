package factoryMethod;

public class MulFactory implements Factory{
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
