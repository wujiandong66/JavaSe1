package oop;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class PrimitiveTestMy {
    int b;
    private static void method(PrimitiveTestMy primitiveTestMy){
        System.out.println("b:"+primitiveTestMy.b);
        primitiveTestMy.b=1;

        System.out.println("c:"+primitiveTestMy.b);

    }

    public static void main(String[] args) {
        PrimitiveTestMy primitiveTestMy=new PrimitiveTestMy();
        primitiveTestMy.b=2;
        System.out.println("a:"+primitiveTestMy.b);
        method(primitiveTestMy);
        System.out.println("d:"+primitiveTestMy.b);
    }
}
