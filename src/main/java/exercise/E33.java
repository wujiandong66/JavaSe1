package exercise;

import java.util.Arrays;

/**
 * Created by mingfei.net@gmail.com
 * 3/29/17 16:57
 * JavaSE_20171
 * <p>
 * 打印出杨辉三角形（要求打印出 n 行如下图）
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1
 * .........（略）
 */
public class E33 {
    public static void main(String[] args) {
        int n = 30;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n -1) - i; j++) {
                System.out.print(" ");
            }
            for (int j : getArray(i + 1)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /**
     * @param n 第 n 行
     * @return 第 n 行的数组
     */
    private static int[] getArray(int n) {
        if (n == 1) {
            return new int[]{1}; //  {1, 2, 3} [1, 2, 3] Arrays.toString(ints);
        } else {
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                if (i == 0 || i == array.length - 1) {
                    array[i] = 1;
                } else {
                    array[i] = getArray(n - 1)[i - 1] + getArray(n - 1)[i];
                }
            }
            return array;
        }
    }
}