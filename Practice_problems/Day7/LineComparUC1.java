package com.mycompany.day09_java_basic;

public class LineComparUC1 {
    public double lineLengthCalc(int x1, int y1, int x2, int y2){
        double line_len = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return line_len;
    }
    public static void main(String []args){
        LineComparUC1 lc1 = new LineComparUC1();
        System.out.println("The length of the line = "+ lc1.lineLengthCalc(2, 0, 4, 0));
    }
}
