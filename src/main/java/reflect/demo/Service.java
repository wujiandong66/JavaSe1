package reflect.demo;

/**
 * Created by mingfei.net@gmail.com
 * 5/5/17 08:55
 * https://github.com/thu/JavaSE_20171
 */
public class Service {
    private FloppyWriter floppyWriter;
    public void write() {
        FloppyWriter floppyWriter1=new FloppyWriter();
        floppyWriter1.writeToFloppy();
    }
}