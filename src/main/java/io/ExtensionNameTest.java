package io;
/**
 * Created by mingfei.net@gmail.com
 * 4/21/17 08:47
 * https://github.com/thu/JavaSE_20171
 */
public class ExtensionNameTest {
    public static void main(String[] args) {
        String s = "123.gif";
        System.out.println(s.substring(s.lastIndexOf('.')));
    }
}