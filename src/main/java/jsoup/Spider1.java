package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by mingfei.net@gmail.com
 * 5/9/17 11:48
 * https://github.com/thu/RealEstate
 */
public class Spider1 {
    public static void main(String[] args) throws IOException {
        String url = "http://bj.lianjia.com/ershoufang/dongcheng/";
        Document document = Jsoup.connect(url).cookie("lianjia_uuid", "fe547e4f-b83f-49be-9708-5af2d41ebef4").get();
        Elements elements = document.select("li[class=clear]");
        System.out.println(elements.size());
        for (Element element : elements) {
            String region = element.select("a[data-el=region]").first().text();
            String totalPrice = element.select("div[class=totalPrice]").first().text();

            Element houseInfoElement = element.select("div[class=houseInfo]").first();
            String houseInfo = "";
            for (Node node : houseInfoElement.childNodes()) {
                if (node instanceof TextNode) {
                    houseInfo = node.toString();
                }
            }
            System.out.println("小区：" + region + "；详情：" + houseInfo + "；总价：" + totalPrice);
        }
    }
}