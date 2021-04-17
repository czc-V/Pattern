package staticFactory;

public class Client {

    public static void main(String[] args) throws Exception {
        Operation operation;
        operation=Factory.createOperation("+");
        operation.a=1;
        operation.b=2;
        System.out.println(operation.getResult());

        operation=Factory.createOperation("未知符号");
    }


}
