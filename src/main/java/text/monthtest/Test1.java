package text.monthtest;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
//接受用户输入的一个字符串，将其每个字节的数据相加求和输出
public class Test1 {
    String s1=new String();
    public static void main(String[] args) {
        Test1 test1=new Test1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string: ");
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
          test1.s1+=chars[i];
        }
        System.out.println(test1.s1);
    }
}

