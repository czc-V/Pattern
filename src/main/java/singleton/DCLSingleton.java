package singleton;

/*
chengzhichao
2021/4/19
单例模式：懒汉式单例模式
双重校验锁，采用双锁机制，安全且在多线程情况下能保持高性能。
实现较为复杂。
volatile的关键作用是防止指令重排。
指令重排是JVM为了优化指令、提高程序运行效率，在不影响单线程程序执行结果的前提下，尽可能地提高并行度。
指令重排包括编译器重排和运行时重排。
 */

public class DCLSingleton {

    private volatile static DCLSingleton instance;
    private DCLSingleton(){}

    public static DCLSingleton getInstance(){
        if(instance==null){
            synchronized (DCLSingleton.class){
                if(instance==null){
                    instance=new DCLSingleton();
                }
            }
        }
        return instance;
    }

}
