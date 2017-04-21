package io;

import java.io.*;

/**
 * Created by mingfei.net@gmail.com
 * 4/21/17 09:38
 * https://github.com/thu/JavaSE_20171
 * 缓冲 Reader
 */
public class BufferedReaderTest {
    private static final String FILE = "src/main/java/java1702/javase/io/BufferedReaderTest.java";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
