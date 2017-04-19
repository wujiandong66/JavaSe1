package text.text415;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/15 0015.
 */
/*
* 写出一个程序，接受一个浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整
例如：
-4.5 四舍五入的结果是-4
4.4 四舍五入的结果是4*/
public class Text5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string: ");
        String string = scanner.nextLine();
        double newdata = Double.valueOf(string);
        Text5 test = new Text5();
        System.out.println(test.rand(newdata));
    }

    public int rand(double d){
      // 应该有个if判断的 是不是正数 时间不够了
        String str = Double.toString(d);
        String str1 = str.substring(str.indexOf(".") + 1,
                str.indexOf(".") + 2);
        int a = Integer.parseInt(str1);
        double data = Double.valueOf(str);
        if (a < 5) {
            String str2 = str.substring(0, str.indexOf(".") + 1);
             return (int) (data = Double.valueOf(str2));
        } else {
            String str3 = str.substring(0, str.indexOf(".") + 1);
            return (int) (data = Double.valueOf(str3))+1;
        }
    }
}
