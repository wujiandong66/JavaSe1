package reflect.demoC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by mingfei.net@gmail.com
 * 5/5/17 10:23
 * https://github.com/thu/JavaSE_20171
 */
public class PropertiesTest {

    // properties 属性\ ['prɒpətɪz]

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/java/reflect/demoC/config.properties"));
        System.out.println(properties.getProperty("key"));
        System.out.println(properties.getProperty("k"));
    }
}