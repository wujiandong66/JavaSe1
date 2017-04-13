package collection.newcollection;

import java.util.Arrays;

/**
 * Created by mingfei.net@gmail.com
 * 4/7/17 13:31
 * https://github.com/thu/JavaSE_20171
 */
public class StringTest {

    /**
     * @param args 主方法的参数数组
     * @author tester
     */
    public static void main(String[] args) {
        String s = "hi";
        System.out.println(s);
        s = "hello";
        System.out.println(s);

        // GC Garbage Collection 垃圾回收机制
        byte[] bytes = new byte[10];
        String s1 = ""; // deprecated 弃用\ [ˈdeprəkeɪtɪd]
        System.out.println("-" + s1 + "-");
        String s2 = "test...";
        String s3 = "test...";
//        String s3 = new String("test...");
        System.out.println(s2 == s3);

        /*
        String Pool 字符串池
        "test..."
         */

//charAt
        System.out.println("hello".charAt(4));
//concat concatenate
        System.out.println("test1".concat("test2"));
//contains
        System.out.println("test1".contains("1"));
//endsWith
        System.out.println("test1".endsWith("t2"));
//equals
        System.out.println("test1".equals("Test1"));
        System.out.println("test1".equalsIgnoreCase("Test1"));
//indexOf
        System.out.println("test1".indexOf("t")); // 0
//lastIndexOf
        System.out.println("test1".lastIndexOf("t")); // 3
//length
        System.out.println("test1测试".length());
//replace
        System.out.println("tets1".replace("ts", "st"));
//split
        System.out.println(Arrays.toString("test1".split("t")));
//startWith
        System.out.println("test1".startsWith("tes"));
//subString
        System.out.println("-------------------------------");
        System.out.println("test1".substring(1, 4));
//toCharArray
        System.out.println(Arrays.toString("test1".toCharArray()));
//toLowerCase
        System.out.println("Hello".toLowerCase());
//toUpperCase
        System.out.println("Hello".toUpperCase());
//trim
        System.out.println("   test1 hello     ".trim()); // trim
//valueOf
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(new char[]{'t', 'e', 's', 't'}));
    }
}
