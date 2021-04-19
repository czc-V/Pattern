package singleton;

/*
chengzhichao
2021/4/19
单例模式：懒汉式单例模式
登记式/静态内部类形式实现单例模式，满足 Lazy 初始化，实现较简单。
 */

public class InnnerSingleton {

    private static class SingletonHolder{
        private static final InnnerSingleton instance=new InnnerSingleton();
    }
    private InnnerSingleton(){}

    public static InnnerSingleton getInstance(){
        return SingletonHolder.instance;
    }

}
