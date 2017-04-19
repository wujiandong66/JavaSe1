package text.text415;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/15 0015.
 */
/*
* 1.
输入字符串长度len1，字符串s1，字符串长度len2，字符串s2。从后向前比较，以最短字符串为标准，输出不同的元素的个数。
例如:
输入：s1=”1,3,5” len1=3 s2=”2,4,1,7,5” len2=5
输出：1*/
public class Text1 {
    public static void main(String[] args) {
        System.out.println("长度: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输出字符: ");
        String[] strings1 = new String[n1];
        for (int i = 0; i < strings1.length; i++) {
            strings1[i] = scanner1.nextLine();
        }

        // String[] 转 String
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < strings1.length; i++) {
            String s = strings1[i];
            sb1.append(s);
        }
        System.out.println(sb1);

        // 字符串 2
        System.out.println("长度: ");
        Scanner scanner3 = new Scanner(System.in);
        int n2 = scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("请输出个字符: ");
        String[] strings2 = new String[n2];
        for (int i = 0; i < strings2.length; i++) {
            strings2[i] = scanner4.nextLine();
        }
        // String[] 转 String
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < strings2.length; i++) {
            String s = strings2[i];
            sb2.append(s);
        }
        System.out.println(sb2);
        // 翻转
        sb1.reverse();
        System.out.println(sb1);
        sb2.reverse();
        System.out.println(sb2);
        String s3 = sb1.toString();
        String s4 = sb2.toString();
        String s5 = s4.substring(0, s3.length());
        System.out.println(s5);
        // 转字符数组比较
        char[] chars1 = s3.toCharArray();
        char[] chars2 = s5.toCharArray();
        int num = 0;
        for (int i = 0; i < chars1.length; i++) {
            char c1 = chars1[i];
            for (int j = 0; j < chars2.length; j++) {
                char c2 = chars2[j];
                if (c1 == c2) {
                    num++;
                }
            }
        }
        System.out.println("不同的个数为" + num);
    }
}
