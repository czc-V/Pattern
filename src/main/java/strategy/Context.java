package strategy;

public class Context {

    private Stragegy stragegy;

    public Context(Stragegy stragegy){
        this.stragegy=stragegy;
    }

    public int executeStrategy(int a,int b){
        return stragegy.operate(a,b);
    }

}
