package multithreading;

import io.JianDanTest;

/**
 * Created by Administrator on 2017/5/8 0008.
 */
public class Test extends JianDanTest implements Runnable{
    public static void main(String[] args) {
        // 进程 process 过程\ ['prəʊses]
        // 线程 thread 线程\ [θred]

        Test test = new Test();
        Thread thread = new Thread(test); // Runnable
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 22; i++) {
            System.out.println("page: " + (i + 1));
            page(i + 1);
        }
    }
}