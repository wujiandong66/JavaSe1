package io;
import java.io.*;

/**
 * Created by mingfei.net@gmail.com
 * 4/21/17 09:07
 * https://github.com/thu/JavaSE_20171
 */
public class BufferedTest {
    public static void main(String[] args) {
        // buffer 缓冲\ ['bʌfə]
        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("/Users/mingfei/Desktop/0421_Buffer.mov"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("/Users/mingfei/Desktop/new_Buffer.mov"))
        ) {
            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}