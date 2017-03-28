package oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/27/17 13:56
 * JavaSE_20171
 */
public class CastTest {
    public static void main(String[] args) {
        // 1.
        int x  = 1;
        String s1 = String.valueOf(x);
        System.out.println(s1);
        // 2.
        String s2 = "123";
        int y = Integer.parseInt(s2);
        System.out.println(y);
    }
}