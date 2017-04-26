package text.monthtest;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
/*
* 1.
编写一个没有处理的发生数组下标越界异常的程序*/
public class TestM1 {
    public static void main(String[] args) {
        System.out.println((new int[]{1, 2, 3})[-1]);
    }
}
