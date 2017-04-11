package newcollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
public class ArraylistStudent {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("龚涛男18岁");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
