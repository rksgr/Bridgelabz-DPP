
package com.mycompany.day09_java_basic;

public class LineComparUC2 {
    public boolean lineLengthEqual(int x1, int y1, int x2,int y2,int x3,int y3,int x4,int y4){
        LineComparUC1 lc1 = new LineComparUC1();
        double len_line1 = lc1.lineLengthCalc( x1, y1, x2, y2);
        LineComparUC1 lc2 = new LineComparUC1();
        double len_line2 = lc2.lineLengthCalc(x3, y3, x4, y4);
        return (len_line1 ==len_line2);
    }
    public static void main(String []args){
        LineComparUC2 lc22= new LineComparUC2();
        if (lc22.lineLengthEqual(1, 2, 5, 5, 9, 9, 6, 9)){
            System.out.println("The line are equal in length");
        } else{
            System.out.println("The line are not equal in length");
        }
    }
}
