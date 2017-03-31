package collection;



import java.util.Arrays;


/**
 * Created by mingfei.net@gmail.com
 * 3/30/17 14:00
 * JavaSE_20171
 */
public class ArrayVector { // 使用数组来模拟一个向量 DynamicArray

    private static final int DEFAULT_CAPACITY = 10;
    private String[] strings;
    private int capacity;
    private int size;

    public ArrayVector() {
        strings = new String[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    public ArrayVector(int initialCapacity) {
        strings = new String[initialCapacity];
        capacity = initialCapacity;
    }

    public void add(String string) {
        if (size == capacity) {
            String[] newStrings = new String[capacity * 2];
            capacity *= 2;
            System.arraycopy(strings, 0, newStrings, 0, strings.length);
            strings = newStrings;
        }
        strings[size] = string;
        size++;
    }

    public String get(int index) {
        if (index >= size) { // Exception
            System.out.println("error.");
            System.exit(0);
        }
        return strings[index];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public String remove(int index) {
        if (index >= size) {
            System.out.println("error.");
            System.exit(0);
        }
        String s = strings[index];
        System.arraycopy(strings, index + 1, strings, index, size - index - 1);
        strings[size - 1] = null;
        size--;
        return s;
    }

    public String set(int index, String element) {
        if (index >= size) {
            System.out.println("error.");
            System.exit(0);
        }
        String s = strings[index];
        strings[index] = element;
        return s;
    }
}