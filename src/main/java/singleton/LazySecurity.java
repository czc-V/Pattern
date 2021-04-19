package singleton;

/*
chengzhichao
2021/4/19
单例模式：懒汉式单例模式
考虑多线程下的线程安全。
 */

public class LazySecurity {

    private static LazySecurity instance;
    private LazySecurity(){};

    public static synchronized LazySecurity getInstance(){
        if(instance==null){
            instance=new LazySecurity();
        }
        return instance;
    }

}
