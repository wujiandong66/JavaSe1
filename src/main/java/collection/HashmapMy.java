package collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class HashmapMy {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"一");
        map.put(30,"三");
        map.put(400,"四");
        map.put(51,"五");
        map.put(22,"二");

        for (Integer integer : map.keySet()) {
            System.out.println(integer+">"+map.get(integer));
        }
        TreeMap<Integer,String> treeMap =new TreeMap<>();
        treeMap.put(1,"one");

        treeMap.put(4,"four");
        treeMap.put(2,null);
        Iterator<Integer> iterator2 = treeMap.keySet().iterator();
        while (iterator2.hasNext()) {
            int key = iterator2.next();
            System.out.println(key + ">" + map.get(key));
        }
    }
}
