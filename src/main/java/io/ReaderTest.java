package io;

import java.io.*;

/**
 * Created by mingfei.net@gmail.com
 * 4/18/17 11:43
 * https://github.com/thu/JavaSE_20171
 */
public class ReaderTest extends FileReader {
    public ReaderTest(String fileName) throws FileNotFoundException {
        super(fileName);
    }
    // JDK 7
    public static void main(String[] args) {
        try (Reader reader = new ReaderTest("test")) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("closed.");
    }
}