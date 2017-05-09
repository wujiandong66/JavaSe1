package reflect;

import java.io.FileDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Created by mingfei.net@gmail.com
 * 5/4/17 08:59
 * https://github.com/thu/JavaSE_20171
 */
public class AccessibleTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person(29);
        Field fields = person.getClass().getDeclaredField("age");
        fields.setAccessible(true);
        fields.setInt(person,1);
        System.out.println(fields.get(person));


    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }



}