package singleton;

/*
chengzhichao
2021/4/19
单例模式：通过枚举实现单例模式。
最佳的单例实现模式就是枚举模式。
让JVM保证线程安全和单一实例的问题，规避了反射攻击以及反序列化攻击的情况，
 */

import java.sql.SQLSyntaxErrorException;

public enum EnumSingleton {

    INSTANCE;
    public void doSomething(){
        System.out.println("doSomething");
    }


}
