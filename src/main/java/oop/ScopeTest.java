package oop;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class ScopeTest {
    // scope 范围\ [skəʊp]

    public void m(String s) {
        System.out.println(i);

        int j = 0; // locale variable
        System.out.println(j);

        method();

        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }

        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }

        int i = 1;
        System.out.println(ScopeTest.i);
    }

    public static void method() {

        i=0;

    }
        int o =1;

    private static int i; // field
}
