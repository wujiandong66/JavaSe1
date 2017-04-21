package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mingfei.net@gmail.com
 * 4/21/17 11:54
 * https://github.com/thu/JavaSE_20171
 */
public class JianDanTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://jandan.net/tag/%E5%A4%A9%E6%96%87");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains("data-original=\"//")) {
                        String imageURL = line.substring(line.indexOf("//tankr"), line.indexOf("jpg"));
                        System.out.println(imageURL);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}