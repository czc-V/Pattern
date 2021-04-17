package access.packagea;

/*
chengzhichao
2021/4/18
关于JAVA中访问权限的学习：同包中所有修饰符修饰的都可见
 */

public class ClassA {

    private String a="a";
    String b="b";
    protected String c="c";
    public String d="d";



    public static void main(String[] args){
        ClassA classA=new ClassA();
        System.out.println(classA.a+classA.b+classA.c+classA.d);
    }


}
