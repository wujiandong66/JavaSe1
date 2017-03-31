package collection;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class ArrayT {
    // array 数组\ [ə'reɪ]
    public static void main(String[] args) {
//        String[] strings1={"a","b","c","d","e","f","g"};
//        String[] strings=new String[10];
//        System.arraycopy(strings1,3, strings1,2 ,2 );
//        for (String string : strings1) {
//            System.out.println(string);
//        }
        ArrayList arrayList = new ArrayList();
            arrayList.add(0,"aaaaa");
            arrayList.add("a");
        System.out.println(arrayList.isEmpty());
            arrayList.toArray();
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
}
