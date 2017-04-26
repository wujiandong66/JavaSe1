package text.monthtest;

import java.io.*;

public class TestM6 {

    static int max, min, sum = 0;

    static int[] a = new int[5000];

    public static void main(String args[]) {

        File f = new File("a.txt");
        if (f == null) {
            System.out.println("Can't create the file");
            System.exit(0);
        }
        genRandom(f);
        calculate(f);
    }

    static void genRandom(File f) { // 产生随机数方法
        try {
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);
            for (int i = 0; i < 5000; i++) {
                dos.writeInt((int) (Math.random() * 10000));
            }
            dos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void calculate(File f) { // 计算最大值、最小值、平均值以及求和方法
        try {
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            int i;
            for (i = 0; i < 5000; i++) {
                a[i] = dis.readInt();
            }
            dis.close();
            max = a[0];
            min = a[0];
            for (i = 0; i < 5000; i++) {
                if (max < a[i]) max = a[i];
                if (min > a[i]) min = a[i];
                sum += a[i];
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int average = sum / 5000;
        System.out.println("max = " + max + "\tmin=" + min);
        System.out.println("sum = " + sum + "\taverage=" + average);
    }
}