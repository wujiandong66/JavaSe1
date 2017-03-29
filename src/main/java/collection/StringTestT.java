package collection;

/**
 * Created by Administrator on 2017/3/28 0028.
 */
public class StringTestT {
    public static void main(String[] args) {
        String s = "helloworld";
        // match 匹配\ [mætʃ]
        System.out.println(s.matches("\\w+")); // JavaScript
//        System.out.println(s.contains("he"));
        System.out.println(s.equals("hello"));

        // repalce 取代\ [rɪ'pleɪs]

//        System.out.println(s.replace("l", "a"));
        System.out.println(s.replaceAll("l", "a"));
       System.out.println(s.replaceAll("\\w", "a"));
        System.out.println("------------");
        System.out.println(s.replaceFirst("l", "a"));
//        String s = "hello";
        String s1 = "asdf";

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s2 = new String(chars);

        System.out.println(s2);

        for (char c : s2.toCharArray()) {
//            System.out.println(c);
        }

        String s3 = "Hello"; // hello HELLO
        System.out.println(toLowerCase(s3));
        System.out.println(toUpperCase(s3));

        String str = new String(chars);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println("итальянский".toLowerCase());
        System.out.println("итальянский".toUpperCase());

        String s4 = "итальитальянскийитальянскийитальянскийитальянскийитальянскийянскийa";
        System.out.println(s4.charAt(s4.length() - 1));
    }

    private static String toLowerCase(String origin) {
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'A' && aChar <= 'Z') {
                chars[i] += 32; // a - A = 32
            }
        }
        return new String(chars);
    }

    private static String toUpperCase(String origin) {
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'a' && aChar <= 'z') {
                chars[i] -= 32; // a - A = 32
            }
        }
        return new String(chars);
    }

}
