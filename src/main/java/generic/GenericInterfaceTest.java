package generic;

/**
 * Created by mingfei.net@gmail.com
 * 4/13/17 11:32
 * https://github.com/thu/JavaSE_20171
 */
public interface GenericInterfaceTest<T> {
    void m1(T t);

    void m2(T t1, T t2);

    T m3();
}
