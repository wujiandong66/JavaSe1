package exercise;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
public class E33My {
    static int[][] ints=new int[10][];
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int j =0; j <i+1 ; j++) {
                if (i==1){
                    ints[i][j]=1;
                }else if (i==2){
                    ints[i][j]=1;
                }else if(j == 0 || j == i+1){
                ints[i][j]=1;
                }else {
                    ints[i][j]=ints[i-1][j]+ints[i-1][j+1];
                }

            }
        }
        for (int[] anInt : ints) {
            System.out.println(anInt);
        }
    }
}
