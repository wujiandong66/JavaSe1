package exercise.BdArr;

import collection.Array;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/5/11 0011.
 */
public class ArrE1 {
    public static void main(String[] args) {
        int array[] ={9,5,-2,6,3,-8,0,4,23,2,13,1};
        Arrays.sort(array);
        printArry("数组排序结果为",array);
        int index =Arrays.binarySearch(array,2); //返回 元素位置  binarySearch
        System.out.println("元素 2  在第"  + index +"个位置");

    }
    private static void printArry( String message ,int array[]){
        System.out.println(message + ":  [length: " +array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if(i!=0){
                System.out.println(",");
            }
            System.out.println(array[i]);
        }
        System.out.println();
    }
}
