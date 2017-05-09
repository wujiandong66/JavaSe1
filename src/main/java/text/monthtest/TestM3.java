package text.monthtest;

import java.io.*;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
public class TestM3 {
    public static void main(String[] args) {
        try (
                BufferedInputStream in1 = new BufferedInputStream(new FileInputStream("src/main/java/text/monthtest/1.txt"));
                BufferedInputStream in2 = new BufferedInputStream(new FileInputStream("src/main/java/text/monthtest/2.txt"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("3.txt"))
        ) {
            int i;
            while ((i = in1.read()) != -1) {
                out.write(i);
            }
            int j;
            while ((j = in2.read()) != -1) {
                out.write(j);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
