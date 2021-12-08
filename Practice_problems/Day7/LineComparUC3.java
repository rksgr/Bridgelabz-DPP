package com.mycompany.day09_java_basic;

public class LineComparUC3 {
    public void lineLengthCompar(int x1, int y1, int x2,int y2,int x3,int y3,int x4,int y4){
        LineComparUC1 lc1 = new LineComparUC1();
        double len_line1 = lc1.lineLengthCalc( x1, y1, x2, y2);
        LineComparUC1 lc2 = new LineComparUC1();
        double len_line2 = lc2.lineLengthCalc(x3, y3, x4, y4);
        if (len_line1>len_line2){
            System.out.println("Line1 is greater than Line2");
        }else if (len_line1==len_line2){
            System.out.println("Line1 is equal to Line2 in length");  
        }else if (len_line1<len_line2){
            System.out.println("Line1 is lesser than Line2 in length");
        }
    }
    public static void main(String []args){
        LineComparUC3 lc3= new LineComparUC3();
        lc3.lineLengthCompar(1, 2, 1, 0, 9, 9, 6, 9);
    }
}
    
