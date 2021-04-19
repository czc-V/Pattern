package singleton;

/*
chengzhichao
2021/4/19
单例模式：懒汉式单例模式
单例模式保证某个类只创建一个实例，保证一个类只有一个实例，并提供一个全局访问点。
最基本懒汉式单例模式的实现，该实现最大的问题就是不支持多线程，多线程下不安全。
 */

public class LazySingleton {

    private static LazySingleton instance;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }

}
