package reflect.demoB;



/**
 * Created by mingfei.net@gmail.com
 * 5/5/17 09:42
 * https://github.com/thu/JavaSE_20171
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service(new PortableHdWriter()); //
//        service.setDeviceWriter(new PortableHdWriter());
        service.write();
    }
}