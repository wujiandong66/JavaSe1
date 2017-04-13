package generic;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public class GenericTest<T> {
    public static void main(String[] args) {
        GenericTest genericTest=new GenericTest();
        System.out.println( genericTest.concat(1,2));
        System.out.println(genericTest.concat(new GenericTest(),new GenericTest() ));
    }
    private String concat( T x, T y){
        return String.valueOf(x).concat(String.valueOf(y));
    }
}
       class son<T> extends GenericTest{
                
}
