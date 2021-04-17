package access.packagea;

/*
chengzhichao
2021/4/18
关于JAVA中访问权限的学习：同包中除private不可见，其他均可见。
 */

public class ClassB {

    public static void main(String[] args){

        ClassA classA=new ClassA();
        System.out.println(classA.b+classA.c+classA.d);


    }

}
