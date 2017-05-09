package test.test1;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/5/6 0006.
 *
 *
 */
/*
* 1.
利用 switch 语句将学生成绩分级,当从键盘中输入学生成绩在 100~90 范围时,
输出“优 秀”,在 89~80 范围时输出“良好”,在 79~70 范围时输出“中等”
,在 69~60 范围时输出 “及格”,在 59~0 范围时输出“不及格”
,在其他范围时输出“成绩输入有误!”。*/

public class E1 {
    public static void main(String[] args) {
        System.out.println("请输入成绩(0-100)");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("成绩输入有误!");
            return;
        }
        System.out.println("成绩为："+getGrade(score));
    }
    public static String getGrade(int i) {
        String result = null;
        switch (i / 10) {
            case 10:
                result = "优";
                break;
            case 9:
                result = "优";
                break;
            case 8:
                result = "良好";
                break;
            case 7:
                result = "中等";
                break;
            case 6:
                result = "及格";
                break;
            default:
                result = "不及格";
                break;
        }
        return result;
    }
}
