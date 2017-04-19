package io;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
public class InputStreamTest {
    public static void main(String[] args) {
//        try {
//            InputStream inputStream = new FileInputStream("src/main/java/io/test.txt");
//            int i;
//            while ((i=inputStream.read())!=-1){
//                System.out.print((char)i);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            InputStream inputStream = new FileInputStream("src/main/java/io/test.txt");
            try {
               inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
