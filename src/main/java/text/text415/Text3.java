package text.text415;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/15 0015.
 */
/*
* 3.
拆分字符串，字符串中含有逗号和数字，对数字排序并输出
例如：String s0=”123,45,25,85”;
输出：25 45 85 123*/
public class Text3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input: ");
        String s = scanner.nextLine();
        String[] strings=s.split(",");
        for (String string : strings) {
            Integer newdata = Integer.valueOf(string);
        }
    }
}
