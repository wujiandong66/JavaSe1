package oop;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class ParameterPassTest {

    private static void test(boolean x) { // 形参
        System.out.println("b: " + x); // 0
        x=false;
        System.out.println("c: " + x); // 1
    }

    public static void main(String[] args) {
        boolean i = true;
        System.out.println("a: " + i); // 0
        test(i); // 实参
        System.out.println("d: " + i); // 0
    }

}
