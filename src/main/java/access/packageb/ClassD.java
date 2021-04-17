package access.packageb;

/*
chengzhichao
2021/4/18
关于JAVA中访问权限的学习：不同包且非子类，private、default、protected不可见，public可见。
 */

import access.packagea.ClassA;

public class ClassD {

    public static void main(String[] args){
        ClassA classA=new ClassA();
        System.out.println(classA.d);

        System.out.println("断点输出！");
    }

}
