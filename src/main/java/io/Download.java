package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mingfei.net@gmail.com
 * 4/18/17 11:53
 * https://github.com/thu/JavaSE_20171
 */
public class Download {
    private static final String IMAGE_URL = "http://www.baidu.com";

    public static void main(String[] args) throws IOException {

            URL url = new URL(IMAGE_URL);
            InputStream inputStream = url.openStream();
            OutputStream outputStream = new FileOutputStream("test.png");
              int i;
             while ((i = inputStream.read()) != -1) {
               outputStream.write(i);
             }



//        try {
//            URL url = new URL(IMAGE_URL);
//            try (
//                    InputStream inputStream = url.openStream();
//                    OutputStream outputStream = new FileOutputStream("test.png")
//            ) {
//                System.out.println(inputStream.available());
//                int i;
//                while ((i = inputStream.read()) != -1) {
//                    outputStream.write(i);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
    }
}