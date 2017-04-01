package text;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
//3. 使用键盘录入一个字符串，获取字符串中每一个字符出现的次数，
// 要求统计结果格式为：a(5),b(4),c(3),d(2),e(1)
public class Test3 {
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string: ");
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        for (char aChar : chars) {
            if (aChar == 'a') {
                a++;
            } else if (aChar == 'b') {
                b++;
            } else if (aChar == 'c') {
                c++;
            } else if (aChar == 'd') {
                d++;
            } else if (aChar == 'e') {
                e++;
            }
        }
        String stringa = "a" + "(" + a + ")";

        String stringb = "b" + "(" + b + ")";

        String stringc = "c" + "(" + c + ")";

        String stringd = "d" + "(" + d + ")";

        String stringe = "e" + "(" + e + ")";

        System.out.println(stringa+","+stringb+","+stringc+","+stringd+","+stringe);
    }
}
