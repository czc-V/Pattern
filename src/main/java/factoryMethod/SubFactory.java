package factoryMethod;

public class SubFactory implements Factory{
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
