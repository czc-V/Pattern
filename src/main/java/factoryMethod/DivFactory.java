package factoryMethod;

public class DivFactory implements Factory{
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
