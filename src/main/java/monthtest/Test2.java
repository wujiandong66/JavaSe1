package monthtest;

import text.Text2;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
/*
* 将一个数组中值为0的项去掉,将不为0的值存入一个新的数组,比如:
　　int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
　　生成的新数组为:
　　int b[]={1,3,4,5,6,6,5,4,7,6,7,5}
*/
public class Test2 {

    public static void main(String[] args) {
        int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        String s = "";
        for(int i=0;i<a.length;i++){
            s = s + a[i];//拼接成字符串，最终放在变量s中
        }
        System.out.println(s);
        String[] s1=s.split("0");


        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < s1.length; i++){
            stringBuffer. append(s1[i]);

        }
        StringBuffer stringBuffer1=stringBuffer;

        for(int i=stringBuffer1.length()-1;i>0;i=i-1){
            stringBuffer1.insert(i, ",");
        }
        String b = stringBuffer1.toString();
        System.out.println(b);
//        char[] b=s2.toCharArray();
//        System.out.println(b);
    }
}
