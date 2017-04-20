package io;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by mingfei.net@gmail.com
 * 4/18/17 11:47
 * https://github.com/thu/JavaSE_20171
 */
public class WriterTest {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("new");
//            writer.write(Integer.parseInt("4e00", 16));
            writer.write(0x4e01);
            // 0b1111_1111_0000 b binary 二进制
            // 0111 八进制
            // 0x11
            System.out.println(011);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}