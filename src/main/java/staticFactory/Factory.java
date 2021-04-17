package staticFactory;

/*
chengzhichao
2021/4/18
简单工厂模式（静态工厂模式）：工厂类,负责实例化产品。
 */

public class Factory {

    public static Operation createOperation(String operate) throws Exception {
        Operation operation=null;

        switch(operate){
            case "+":
                operation=new OperationAdd();
                break;
            case "-":
                operation=new OperationSub();
                break;
            case "*":
                operation=new OperationMul();
                break;
            case "/":
                operation=new OperationDiv();
                break;
            default:
                throw new Exception("未知运算符号错误！");
        }
        return operation;

    }



}
