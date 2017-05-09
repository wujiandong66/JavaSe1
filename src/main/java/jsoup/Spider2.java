package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by mingfei.net@gmail.com
 * 5/9/17 11:48
 * https://github.com/thu/RealEstate
 */
public class Spider2 {
    private static final String url = "http://bj.lianjia.com/ershoufang/dongcheng/pg";
    private static int counter;

    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect(url).cookie("lianjia_uuid", "fe547e4f-b83f-49be-9708-5af2d41ebef4").get();
        //设置cookie  获得文本内容
        int total = Integer.parseInt(document.select("h2[class=total fl]").first().child(0).text());
        //
        int pages = (int) Math.ceil(total / 30d);
        for (int i = 0; i < pages; i++) {
            System.out.println("page: " + (i + 1));
            page(i + 1);
        }
    }

    private static void page(int page) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/test", true))) {
            Document document = Jsoup.connect(url + page).cookie("lianjia_uuid", "fe547e4f-b83f-49be-9708-5af2d41ebef4").get();
            Elements elements = document.select("li[class=clear]");
            for (Element element : elements) {
                String region = element.select("a[data-el=region]").first().text();
                String totalPrice = element.select("div[class=totalPrice]").first().child(0).text();
                Element houseInfoElement = element.select("div[class=houseInfo]").first();
                String houseInfo = houseInfoElement.childNode(2).toString();
                String unitPrice = element.select("div[class=unitPrice]").first().attr("data-price");
                writer.write(region + "@" + houseInfo + "@" + totalPrice + "@" + unitPrice + "\n");
                System.out.println("\t" + "counter: " + ++counter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}