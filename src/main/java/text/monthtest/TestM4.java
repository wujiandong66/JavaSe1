package text.monthtest;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
/*编写一个程序实现以下功能:
(1)产生5000个1~9999之间的随机整数,将其存入文本文件a.txt中
(2)从文件中读取这5000个整数,并计算其最大值、最小值和平均值并输出结果。*/


public class TestM4 {
    public static void main(String[] args){
        File file = new File("src/main/java/text/monthtest/a.txt");
        try ( BufferedWriter bw = new BufferedWriter( new FileWriter(file));){
            for (int i = 0; i < 5001; i++) {
                bw.write((int) (Math.random() * 10000));
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        try( BufferedReader rd= new BufferedReader( new FileReader(file))) {
            int i;
            int[] ints =new int[5000];
            int index=0;
            while ((i = rd.read()) != -1) {
                System.out.println(i);
                for (int j = 0; j <5000; j++) {
                    ints[j]=i;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
