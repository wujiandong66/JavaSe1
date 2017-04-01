package text;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
//4. 将如下两个数组中重复的元素存入一个新的数组
public class Test4 {


    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        int[] ints1={89,90,77,87,66,54,328,890,99};
        int[] ints2  ={65,72,12,77,2,96,54,27,89};
        for (int i = 0; i <ints1.length ; i++) {
            for (int j = 0; j <ints2.length ; j++) {
                if (ints1[i]==ints2[j]){
                    int s=ints2[j];
                    for (int k = 0; k <10 ; k++) {
                        arrayList.add(k,s);
                        break;
                    }

                }
            }
        }
        System.out.println(arrayList);
    }
}
