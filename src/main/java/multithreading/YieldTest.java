package multithreading;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class YieldTest implements Runnable {
    public static void main(String[] args) {
        Thread thread1 =new Thread( new YieldTest(),"thread 1");
        Thread thread2 =new Thread( new YieldTest(),"thread 2" );
        Thread thread3 =new Thread( new YieldTest(),"thread 3" );
        thread1.setPriority(1);
        thread2.setPriority(5);
        thread2.setPriority(10);
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("........test");
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i + ":"+ Thread.currentThread().getName()+"this thread is running");
        }
    }
}

