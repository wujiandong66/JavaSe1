package test.test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
/*
* 使用反射机制获取 java.lang.String 类的所有域、构造方法、成员方法*/
public class E4 {
    private static String methodName;

    public static void main(String[] args) {
       String string =new String();
       Class clazz = String.class;
        try {
            Method method=clazz.getMethod(methodName);
            Constructor constructor = clazz.getDeclaredConstructor();
            Field[] fields = clazz.getFields();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
