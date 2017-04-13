package collection.newcollection;

import java.util.Hashtable;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
public class HashtableMY {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(1,"s");

        System.out.println(hashtable.get(2));
        System.out.println(hashtable.remove(1,"s"));
        System.out.println(hashtable.get(1));

    }
}
