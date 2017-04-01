package text;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
//5. 定义一个方法，实现数组的转置输出
// 例如： 源数组，1 2 3 4 5 6 转置之后的数组，6 5 4 3 2 1

public class Test5 {
    public static void main(String[] args) {
        ArrayList arrayList2 = new ArrayList();
        int[] ints1={1,2,3,4,5,6};
        int s=ints1.length-1;
        for (int i = 0; i <ints1.length; i++) {
            arrayList2.add(ints1[s]);
            s--;
        }
        System.out.println(arrayList2);
    }
}