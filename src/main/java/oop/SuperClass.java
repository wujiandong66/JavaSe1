package oop;

/**
 * Created by Administrator on 2017/4/5 0005.
 */
public class SuperClass {
    int i;


    public SuperClass(){}

    public SuperClass(int i) {
        this.i = i;
        System.out.println("in super class constructor...");
    }

    public void method() {
        System.out.println("method...");
    }
}

class SubClass extends SuperClass {
    private boolean b;

    public SubClass() {
//        super();
        System.out.println("in sub class constructor...");
    }

    public void m() {
        System.out.println("m...");
    }

    public boolean getB() {
        return b;
    }
}

class Test {
    public static void main(String[] args) {
//        SuperClass superClass = new SuperClass();
//        System.out.println(superClass.i); // 1
//        superClass.method();

        SubClass subClass = new SubClass();
        System.out.println(subClass.i); // 1 2
//        System.out.println(subClass.getB());
//        subClass.method();
//        subClass.m();
    }
}