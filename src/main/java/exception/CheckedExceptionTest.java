package exception;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
public class CheckedExceptionTest {
    public static void main(String[] args) {
        test();
        throw  new ArrayIndexOutOfBoundsException();
    }

    private static void test() {
        System.out.println("");
        Scanner scanner =new Scanner(System.in);
        String s =scanner.nextLine();
        try {
            RandomAccessFile randomAccessFile =new RandomAccessFile( s,"r");
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.err.println("file not foud please input fileName again");
            test();
        }
    }
}
