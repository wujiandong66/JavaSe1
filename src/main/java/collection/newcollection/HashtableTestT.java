package collection.newcollection;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/11 0011.
 */
public class HashtableTestT {
    public static void main(String[] args) {
        // K - key 键  V - value 值
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "hi");
        hashtable.put(2, "hello");
        hashtable.put(3, "hello");
        hashtable.put(3, "test");

        System.out.println("size: " + hashtable.size());
        System.out.println(hashtable.get(2));
        System.out.println(hashtable.contains("hi"));
//        hashtable.remove(1);
        System.out.println(hashtable.size());

        for (Integer integer : hashtable.keySet()) { // set 设置 集合
            System.out.println(integer + "->" + hashtable.get(integer));
        }

        for (String s : hashtable.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "->" + integerStringEntry.getValue());
        } // entry
    }
}