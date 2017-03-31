package collection;

import java.util.*;

/**
 * Created by mingfei.net@gmail.com
 * 3/31/17 11:28
 * JavaSE_20171
 */
public class ListTest extends ArrayList {
    public static void main(String[] args) {
//        Iterable 可迭代的
//        Collection 集合
//        List 列表
//        Set 集合
//        Map 映射
//        Vector

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("hello");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.contains("hello"));
        System.out.println(arrayList.indexOf("hello"));
        System.out.println(arrayList.lastIndexOf("hello"));
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.set(1, "test"));
        System.out.println(arrayList.isEmpty());
//        arrayList.clear();
        System.out.println(arrayList.isEmpty());
        System.out.println("--->" + arrayList);
        Object[] objects = arrayList.toArray();

        ListTest listTest = new ListTest();
        for (int i = 0; i < 10; i++) {
            listTest.add("" + i);
        }
        listTest.removeRange(3, 5);
        for (Object o : listTest) {
           System.out.println(o);
        }

    }
}