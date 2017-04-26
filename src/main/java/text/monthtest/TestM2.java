package text.monthtest;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
/*
* 编写一个正确处理的产生空指针异常的程序*/
public class TestM2 {
    public static void main(String[] args) {
        try {
            String s= null;
            System.out.println(s.toUpperCase());
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }
}
