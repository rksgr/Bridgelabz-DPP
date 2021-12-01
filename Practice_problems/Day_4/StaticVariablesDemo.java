/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
2. Write a Program to demonstrate the use of the static variable, blocks.
* 
* The static block is executed first followed by the constructor, and then the static method.
 */
public class StaticVariablesDemo {
    // static variable
    static int a = 5;
    int c = 9;
    public StaticVariablesDemo(){
    System.out.println(a);
    }
    static{
        int s = 2;
        int t = 9;
        System.out.println(s*t);
    }
    public static int area_rec(int a, int b){
        System.out.println("length of rectangle= "+a);
        System.out.println("breadth of rectangle= "+b);
        System.out.println("Area of rectangle = "+ a*b);
        return a*b;
    }
    public static void main(String []args){
        StaticVariablesDemo svd = new StaticVariablesDemo();
        area_rec(3,4);
    }
}
