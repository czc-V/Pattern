package access.packageb;

/*
chengzhichao
2021/4/18
关于JAVA中访问权限的学习：不同包子类，private、default不可见，protected和public可见
 */

import access.packagea.ClassA;

 class ClassC extends ClassA {

    public static void main(String[] args) {
        ClassA classA=new ClassA();
        //System.out.println(classA.c);
        System.out.println(classA.d);

        ClassC classC=new ClassC();
        System.out.println(classC.c+classC.d);

    }

}
