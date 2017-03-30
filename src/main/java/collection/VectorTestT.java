package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Created by Administrator on 2017/3/29 0029.
 */
public class VectorTestT {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>(); // JDK5

        vector.add("hi"); // 元素 组件
        vector.add("hello");
        vector.add("test");
        vector.add("hi");
        vector.set(3,"ooo");
        vector.remove(2);
        vector.setElementAt("a",2);
//        System.out.println(vector.get(0));
//        System.out.println(vector.size());

        for (String s : vector) {
            System.out.println(s);
        }

//        System.out.println(vector.size());
//        System.out.println(vector.capacity());
        // capacity 容量,\ 能力,\ 容积

        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        strings.add("aaa");
//        System.out.println(strings.size());
    }
}
