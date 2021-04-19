package singleton;

/*
chengzhichao
2021/4/19
单例模式：饿汉式单例模式
单例模式保证某个类只创建一个实例，保证一个类只有一个实例，并提供一个全局访问点。
饿汉式单例模式，在类被加载的时候就把实例给创建出来了，可能在还不需要此实例的时候就已经把实例创建出来了。
未起到lazy loading懒加载的效果。
优点是实现简单，而且安全可靠。

 */

public class HungrySingleton {

    private static HungrySingleton hungrySingleton=new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
