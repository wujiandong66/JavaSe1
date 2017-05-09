package test.test1;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
/*
* 编写一个实现方法重载的程序*/
public class E2 {
    public static void main(String[] args) {
        E2 e2 =new E2();
        e2.sum(1,1);
    }
   public int sum(int m, int n){
        return m + n;
    }
    public  int sum(int m,int n,int k){
        return m+n+k;
    }
    public  double sum(double m,double n){
        return m + n;
    }
    public  double sum(double m,double n,double k){
        return m+n+k;
    }
}
