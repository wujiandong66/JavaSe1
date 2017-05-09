package reflect.father;
/**
 * Created by mingfei.net@gmail.com
 * 5/5/17 15:16
 * https://github.com/thu/JavaSE_20171
 */

public class Father<C> { // C - Career
}

class SonA extends Father<Doctor> {}
class SonB extends Father<Lawyer> {}
class SonC extends Father<Programmer> {}
class SonD extends Father<Programmer> {}

class Doctor {}

class Lawyer {}

class Programmer {}

class SonTest {
    public static void main(String[] args) {
        SonA sonA = new SonA();
        SonB sonB = new SonB();
        SonC sonC = new SonC();
        SonD sonD = new SonD();
        // son* > career?
    }
}
