package newcollection;

import java.util.Hashtable;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
public class HashtableStudent {
    public static void main(String[] args) {
        Hashtable<String,String> stringHashtable =new Hashtable<>();
        stringHashtable.put("龚涛","18岁男");
        stringHashtable.put("吴建东","18岁男");
        stringHashtable.put("江振亚","18岁男");
        stringHashtable.put("安璐","16岁女");
        stringHashtable.put("曹文丛","18岁女");
        stringHashtable.put("周猛","18岁男");
        for (String s : stringHashtable.keySet()) {
            System.out.println(s + "->" + stringHashtable.get(s));
        }
    }
}
