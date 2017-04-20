package io;

import java.io.*;

/**
 * Created by mingfei.net@gmail.com
 * 4/20/17 10:07
 * https://github.com/thu/JavaSE_20171
 */
public class InputStreamOutputStream {

    private static final String PATH = "src/main/java/java1702/javase/io/";

    public static void main(String[] args) {
        try (
                InputStream inputStream = new FileInputStream(PATH.concat("InputStreamOutputStream.java"));
                OutputStream outputStream = new FileOutputStream(PATH.concat("Test.java"))
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}