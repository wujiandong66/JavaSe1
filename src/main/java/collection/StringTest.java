package collection;

import com.sun.scenario.effect.Merge;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2017/3/28 0028.
 */
public class StringTest {

    int s1 = 1;
    int s2 = 1;

    public int method() {

        return s1 == s2 ? 1 : 2;
    }


    public static void main(String[] args) throws UnsupportedEncodingException {

        StringTest stringTest = new StringTest();
        System.out.println(stringTest.method());
        String s1 = "asss";
        String cde = "cde";
        String s = "Afghh";
        String z = "hh";
        String zz = "w";
        System.out.println(s.codePointAt(0));//65
        System.out.println(s.codePointBefore(1));// String s = "Afghh"; index:1前面的 还是A 65
        System.out.println(s.codePointCount(1, 3));//2
        System.out.println(s.charAt(0));//A
        /*
        在计算字符串长度时，Java的两种方法length()和codePointCount()一度让我困惑，运行书上例子得到的长度值是相等的，那为什么要设定两个方法呢？

        对于普通字符串，这两种方法得到的值是一样的，但对于UniCode的编码来说，还是有一点区别。

        常用的uniCode字符使用一个代码单元就可以表示，但有些辅助字符需要一对代码单元表示。

        比如整数集合的数学符号"Z"（没办法打出来），它的代码点是U+1D56B，但它的代理单元是U+D835和U+DD6B，如果令字符串str = "/u1D56B"，机器识别的不是"Z"，而是一个代码点”/u1D56“和字符”B“，所以会得到它的代码点数是2，代码单元数也是2。

        但如果令字符str = "/uD835/uDD6B"，那么机器会识别它是2个代码单元代理的1个代码点”Z“，故而，length的结果是代码单元数量2，而codePointCount()的结果是代码点数量1.

        但平常我们使用时，这两种求字符串长度的方法还是通用的，不用加以区别。
        */
        System.out.println("--------------------------");
        String s5 = "1aa2abcd";
        String z5 = "ABCD";
        String s6 = "abcd";
        String z6 = "abcd";
        System.out.println(s5.compareTo(z5));//S5和z5差4个数  输出32
        System.out.println(s5.compareToIgnoreCase(z5));//区分大小写 输出-1
        System.out.println("-------------------------");
        System.out.println(s5.concat(z5));//连接符
        System.out.println(s5.contains(z6));//输出true s5中 含有z6部分
        System.out.println(s6.contentEquals(z6));//比较两个字符串或者字符是否一样 输出true
        System.out.println(s5.endsWith(z6));//输出true s5是不是用z6结尾
        System.out.println(s6.equals(z6));//输出true equals() 方法用于将字符串与指定的对象比较
        System.out.println(z5.equalsIgnoreCase(s6));//输出true  用于比较不区分大小写
        System.out.println("----------equals-getBytes----------");
        System.out.println(z5.getBytes());//输出[B@74a14482
        System.out.println(s5.getBytes("ISO-8859-1"));//输出[B@1540e19d
        /*
        getBytes() 方法有两种形式：
        getBytes(String charsetName): 使用指定的字符集将字符串编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        getBytes(): 使用平台的默认字符集将字符串编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        */
        System.out.println("-------lastIndexOf--------indexOf--isEmpty--length--matches--replace--------");
        String s7 = "";
        System.out.println(s5.indexOf(z6));
        System.out.println(s7.isEmpty());//当且仅当 length() 为 0 时返回 true。
        System.out.println(s5.lastIndexOf("d"));//返回指定字符在此字符串中最后一次出现处的索引
        System.out.println(s5.length());//长度s5 8
        System.out.println(s5.matches("(.*)abcd(.*)"));//true 告知此字符串是否匹配给定的正则表达式。
        System.out.println(s5.replace('a', 'T'));//输出1TT2Tbcd

//        String c = "abc".substring(0,3);
//        String d = cde.substring(0, 1);
//
//        char[] chars = {'H', 'e', 'l', 'l', 'o'};
//        String ss=  s1.toUpperCase();
//        String s2= new String(chars);
//        System.out.println(ss);

//        System.out.println(s1); // ""; null
    }

}
