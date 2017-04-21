package io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by mingfei.net@gmail.com
 * 4/21/17 10:22
 * https://github.com/thu/JavaSE_20171
 */
public class FileTest {
    // File 文件 目录
    public static void main(String[] args) {
        File file = new File("raf");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
/*
        try {
            System.out.println("create: " + file.createNewFile()); // ?
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

//        file.delete();
//        file.deleteOnExit();
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getParentFile());

        System.out.println(new Date(file.lastModified()));

//        for (File f : file.listFiles()) {
//            System.out.println(f.isFile());
//        }

//        System.out.println(file.mkdirs()); // mk make dir directory
        file.setReadable(true);
        file.setWritable(true);
    }
}