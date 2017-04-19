package text.text415;


import java.util.Hashtable;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/15 0015.
 */
/*
* 找出字符串中出现次数最多的字母和出现的次数*/
public class Text2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("input string: ");
            String s = scanner.nextLine();
              Hashtable<Character, Integer> hashtable = new <Character, Integer>Hashtable();
                int len = s.length();
                for(int i=0; i<s.length();i++) {
                    Character k = s.charAt(i);
                    hashtable.put(k, (hashtable.get(k) == null ? 1: hashtable.get(k) + 1));
                }
                System.out.println(hashtable);
            }

}

