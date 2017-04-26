package text.monthtest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
/*
* 编写一个程序,将Fibonacii数列的前20项写入一个随机访问文件raf.txt
然后从该文件中读出第2、4、6等偶数位置上的项并将它们依次写入另一个文件output.txt*/
public class TestM5 {
    public static void main(String[] args) {
        int[] ints ={ 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,377,610,987,1597,2584,4181,6765};

        try (RandomAccessFile randomAccessFile = new RandomAccessFile("raf.txt", "rw");
             OutputStream outputStream = new FileOutputStream("output.txt")){
            for (int i = 0; i <ints.length; i++) {
                randomAccessFile.writeInt(ints[i]);
            }
            randomAccessFile.seek(4L);
            outputStream.write(randomAccessFile.readInt());
            randomAccessFile.seek(12L);
            outputStream.write(randomAccessFile.readInt());
            randomAccessFile.seek(20L);
            outputStream.write(randomAccessFile.readInt());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}
