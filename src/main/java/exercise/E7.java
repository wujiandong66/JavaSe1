package exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/29 0029.
 */
//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
    /*char data[] = {'a', 'b', 'c'};
     String str = new String(data);
*/
        public class E7 {
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;

            public static void main(String[] args) {
                E7 e7 = new E7();
                Scanner scanner = new Scanner(System.in);
                System.out.println("input n: ");
                String n = scanner.nextLine();
                e7.getshuzi(n);
                e7.getzimu(n);
                e7.getspace(n);
                System.out.println("----符号----");
                System.out.println(n.length() - e7.n1 - e7.n2 - e7.n3);
            }

            public void getshuzi(String str1) {
                System.out.println("------数字-----");

                String[] strings1 = str1.split("\\D+");//数字数字个数
                for (String string1 : strings1) {
                    n1 += string1.length();
                }
                System.out.println(n1);
            }

            public void getzimu(String str2) {
                System.out.println("------字母-----");

                String[] strings2 = str2.split("\\W+");
                for (String string1 : strings2) {
                    n2 += string1.length();
                }


                System.out.println(n2 - n1);
            }

            public void getspace(String str3) {
                System.out.println("------空格-----");

                String[] strings1 = str3.split("\\S+");//数字数字个数
                for (String string1 : strings1) {
                    n3 += string1.length();
                }
                System.out.println(n3);
            }

        }
