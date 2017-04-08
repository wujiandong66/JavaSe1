package oop;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public abstract class AbstractTestMy {
    public AbstractTestMy(int i) {
        this.i = i;
    }

    private int i;
    public abstract void method( int i );
}
class SubAbstractTestMy extends AbstractTestMy{

    public SubAbstractTestMy(int i) {
        super(i);
    }

    @Override
    public void method( int i) {

    }
}
