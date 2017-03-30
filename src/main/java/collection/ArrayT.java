package collection;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class ArrayT {
    // array 数组\ [ə'reɪ]
    public static void main(String[] args) {
        String[] strings;
        strings = new String[10];
        strings[0] = "test...";
        System.out.println(strings[0]); // 下标 索引 index

        boolean[] booleans = new boolean[100];
        System.out.println(booleans[99]); // ?

        int[] ints = {1, 2, 3, 4, 5, 6, 67777, 888};
        System.out.println(ints.toString());
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        System.out.println(ints[6]);

        double[] doubles = new double[10000];
        System.out.println(doubles.length);


        ArrayTest[] arrayTests = {new ArrayTest(), new ArrayTest(), new ArrayTest()};
//        arrayTests[0] = new ArrayTest();
        System.out.println(arrayTests[0]); // java1702.javase.collection.ArrayTest@
        System.out.println(arrayTests[1]); // ?
        System.out.println(arrayTests[2]); // ?
    }

    private static class ArrayTest {
    }
}
