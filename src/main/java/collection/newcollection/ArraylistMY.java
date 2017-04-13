package collection.newcollection;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
public class ArraylistMY {
    private static final int N = 10000000;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<String> strings = new ArrayList<>(1000); // 10
        System.out.println("c1: " + getCapacity(strings));
        strings.ensureCapacity(N); // ensure 保证
        System.out.println("c2: " + getCapacity(strings));
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            strings.add("hello");
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    private static int getCapacity(ArrayList<String> strings) throws NoSuchFieldException, IllegalAccessException {
        Field field = ArrayList.class.getDeclaredField("elementData"); // reflect vi.\ 反射，映现；深思
        field.setAccessible(true);
        return ((Object[]) field.get(strings)).length;
    }
}
