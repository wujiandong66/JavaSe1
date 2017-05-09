package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/4/27 0027.
 */
public class Text {
    public static void main(String[] args) {
//        Pattern 模式
//        Matcher 匹配
        System.out.println(Pattern.CASE_INSENSITIVE);
        Pattern pattern =Pattern.compile("l",Pattern.CASE_INSENSITIVE);
//        Pattern pattern =Pattern.compile("\\w+");
        Matcher matcher=pattern.matcher("hello");
//        System.out.println( matcher.find());

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
