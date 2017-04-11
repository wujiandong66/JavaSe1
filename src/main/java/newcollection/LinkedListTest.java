package newcollection;

import java.util.LinkedList;

/**
 * Created by Administrator on 2017/4/11 0011.
 */
public class LinkedListTest {
    // link 链接\ [lɪŋk]
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        LinkedList<String>linkedList1 =new LinkedList<>();
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());
    }
}