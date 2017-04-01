package text;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/1 0001.
 */



    /**
     * Created by Administrator on 2017/4/1 0001.
     */
//2. 从键盘上输入一个字符串，利用字符串类的方法将大写字母转变为小写字
// 母，小写字母转变为大写字母，再将前后字符对换,然后输出最后结果

    public class Text2 {
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
          System.out.println("input string: ");
          String string = scanner.nextLine();
           char[] chars = string.toCharArray();
            for (int i = 0; i <chars.length ; i++) {
                if (chars[i] >= 'A' && chars[i] <= 'Z'){
                    chars[i] += 32;
                }else if (chars[i] >= 'a' && chars[i] <= 'z'){
                    chars[i] -= 32;
                }
            }
            char chars1=chars[0];
            chars[0]=chars[chars.length-1];
            chars[chars.length-1]=chars1;
            System.out.println(chars);
        }
    }
