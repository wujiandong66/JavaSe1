package reflect.demoB;

/**
 * Created by mingfei.net@gmail.com
 * 5/5/17 09:40
 * https://github.com/thu/JavaSE_20171
 */
public class FloppyWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        // ...
        System.out.println("write to floppy...");
    }
}
