package collection;


import java.util.Vector;

/**
 * Created by mingfei.net@gmail.com
 * 3/30/17 14:00
 * JavaSE_20171
 */
public class ArrayVector { // 使用数组来模拟一个向量 DynamicArray

    private static final int DEFAULT_CAPACITY = 10;
    private String[] strings;
    private int size;

    public ArrayVector() {
        strings = new String[DEFAULT_CAPACITY];
    }

    public ArrayVector(int initialCapacity) {
        strings = new String[initialCapacity];
    }

    public void add(String string) {
        strings[size] = string;
        size++;
    }

    public String get(int index) {
        return strings[index];
    }

    public static void main(String[] args) {
        // void add(String element)
        // String remove(int index)
        // String set(int index, String element)
        // String get(int index)
        // int size()
        // int capacity()

        ArrayVector arrayVector = new ArrayVector();
        arrayVector.add("hello");
        arrayVector.add("hi");
        System.out.println(arrayVector.get(0)); // hello
        System.out.println(arrayVector.get(1)); // hi
    }

    /*
         |-----10------|
         |----------20----------|
     */
}