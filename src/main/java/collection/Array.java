package collection;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class Array {
    public static void main(String[] args) {
        String[] strings=new String[10];
        System.out.println(strings[0]);
//        int[] ints =new int[10];两种方式
        int[] ints={1,23,4};
        System.out.println(ints[2]);
//        两种方式
        System.out.println(ints[1]);
        Array[] arrays ={new Array() ,new Array()};
        System.out.println(arrays[0]);
        System.out.println(arrays[1]);
    }
}
