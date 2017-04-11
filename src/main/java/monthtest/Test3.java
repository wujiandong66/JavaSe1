package monthtest;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
/*
* 编写一个java应用程序，要求如下：
　　（1）声明一个String类的变量并初始化值“Hello World”。
　　（2）用字符串类的一个方法将上面变量的值拆分成” Hello” 和“World”两个字符串并打印输出。
　　（3）将” Hello”这个变量转换成大写、“World”转换成 小写并打印输出。
　　（4）声明一个String类的变量并初始化值“20100110”。
　　（5）将上面变量的值转换成2010年1月10日的形式打印输出。
*/
public class Test3 {
   private static String string="Hello World";
    private static String string1="20100110";
    public static void main(String[] args) {
        String[] strings =string .split(" ");
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
        }
        System.out.println(strings[0].toUpperCase());
        System.out.println(strings[1].toLowerCase());
        StringBuffer stringBuffer=new StringBuffer(string1);
        System.out.println(stringBuffer.insert(4,"年").delete(5,6).insert(6,"月").insert(9,"日"));
    }
}
