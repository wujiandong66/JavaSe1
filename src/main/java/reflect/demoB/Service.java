package reflect.demoB;

/**
 * Created by mingfei.net@gmail.com
 * 5/5/17 09:41
 * https://github.com/thu/JavaSE_20171
 */

// 强耦合 -> 松散耦合 解耦合
public class Service {
    private DeviceWriter deviceWriter;

    public Service(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

//    public void setDeviceWriter(DeviceWriter deviceWriter) {
//        this.deviceWriter = deviceWriter;
//    }

    public void write() {
        deviceWriter.writeToDevice();
    }
}
