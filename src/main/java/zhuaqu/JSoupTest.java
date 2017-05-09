package zhuaqu;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by mingfei.net@gmail.com
 * 5/8/17 17:19
 * https://github.com/thu/JavaSE_20171
 */
public class JSoupTest {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://jandan.net/tag/nasa").get();
        Elements elements = document.select("img[class=lazy]");
        for (Element element : elements) {
            System.out.println("http:" + element.attr("data-original"));
        }
    }
}