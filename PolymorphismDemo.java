/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 5. Write a Program to demonstrate the Polymorphism with types
 * method overloading and Method overriding in Java.
 */
public class PolymorphismDemo extends SuperClass{
        public void method1(int a){
            // Method overriding (calling method of the parent class)
            super.method1(8,9);
            System.out.println("Side of square = " + a);
}
    public void method1(int a, int b){
        System.out.println("Length of rectangle = " +a);
        System.out.println("Breadth of rectangle = " +b);     
    }
    public static void main(String []args){
        // Method overloading ( different no of parameters)
        PolymorphismDemo pd = new PolymorphismDemo();
        pd.method1(5);
        pd.method1(7,5);
    }
    }
class SuperClass{
    public void method1(int a, int b){
        System.out.println("Radius of cylinder= " +a);
        System.out.println("Height of cylinder= " +b);
        System.out.println("Area of cylinder= " +(2*3.14*a*b));
    }
}

