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
        strings.remove(0);
        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());
    }
}