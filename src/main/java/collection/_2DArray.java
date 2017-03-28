package collection;

/**
 * Created by mingfei.net@gmail.com
 * 3/28/17 09:06
 * JavaSE_20171
 */
public class _2DArray {
    public static void main(String[] args) {
        String[] color ={"red","blue","white","yellow","greem","gray","yellow","greem","gray","gray"};
        String[][] strings = new String[10][10];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j]=color[Integer.parseInt(String.valueOf(Math.random()*10%10))];

                System.out.println(strings[i][j] + "\t");
            }
            System.out.println();
        }
//        String[][] strings= {
//                {"red","gray","blue" ,"black","yellow","white","red","gray","blue" ,"black"},
//                {"red","gray","blue" ,"black","yellow","white","red","gray","blue" ,"black"},
//                {"red","gray","blue" ,"black","yellow","white","red","gray","blue" ,"black"},
//                {"red","gray","blue" ,"black","yellow","white","red","gray","blue" ,"black"},
//                {"red","gray","blue" ,"black","yellow","white","red","gray","blue" ,"black"},
//                {"red","gray","blue" ,"black","yellow","white","red","gray","blue" ,"black"},
//                {"red","gray","blue" ,"black","yellow","white","red","gray","blue" ,"black"},
//                {"red","gray","blue" ,"black","yellow","white","red","gray","blue" ,"black"},
//                {"red","gray","blue" ,"black","yellow","white","red","gray","blue" ,"black"},
//                {"red","gray","blue" ,"black","yellow","white","red","gray","blue" ,"black"},
//
//        };
//        for (int i = 0; i < strings.length; i++) {
//            for (int j = 0; j < strings[i].length; j++) {
//                System.out.print(strings[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int[][] ints = new int[3][5];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(ints[i][j] + "\t");
//            }
//            System.out.println();
//        }
    }
}