package oop;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public final class FinalTest { // 终态类

    private final int i;

    public FinalTest(int i) {
        this.i = i;
    }

    public FinalTest() {
        i = 1;
    }

    public final void m() {
//        i = 1;
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest(1);
    }

}

//class SubFinalTest extends FinalTest {
//    @Override
//    public void m() {
//        super.m();
//    }
//}
