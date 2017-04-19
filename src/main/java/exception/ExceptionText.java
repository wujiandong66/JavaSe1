package exception;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public class ExceptionText {
    public static void main(String[] args) {
        System.out.println((new int[]{1, 2, 3})[0]);
        System.out.println("hello".charAt(0));
        System.out.println(1 / 0);
        System.out.println(Integer.valueOf("13"));
        String ss=null;
        System.out.println(ss.toUpperCase());
//        try{
//            System.out.println((new int[]{1,2,3})[4]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
////        System.out.println(Integer.valueOf("13"));
//        try {
//            System.out.println("hello".charAt(5));
//           // System.out.println((new int[]{1,2,3})[4]);
//        }catch (StringIndexOutOfBoundsException e) {
//
//        }catch (ArrayIndexOutOfBoundsException e){
//
//        }
//        try {
//            System.out.println((new int[]{1,2,3})[0]);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(1/1);

    }
}
