/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
4. Write a Program to demonstrate the Java Inheritance with all 
* Inheritance Types and Super Keyword.
 */
public class InheritanceDemo extends SuperClass{
    public void find_Area(){
        System.out.println("This method calls the method of parent class using super keyword");
        // Method overriding
        super.find_Area(7.9);
        }
    public void print_Variable(){
        System.out.println("This method calls the instance variable of parent class using super keyword");
        System.out.println(super.a);
        }
    public static void main(String []args){
     InheritanceDemo id = new InheritanceDemo();
     // Instance of child class is used to call a method of parent class
     id.find_Area(5);
     id.find_Area(2.2,5.5);
     id.find_Area();
     id.print_Variable();
    }  
}
class SuperClass{
    public String a ="Lab";
    public void find_Area(int a, int b){
        System.out.println("Area of the rectangle = " +(a*b));
    }
    public void find_Area(int a){    
        System.out.println("Area of the square = " +(a*a));
    }
    public void find_Area(double a, double b){
        System.out.println("Area of the cylinder = " +(2*3.14*a*b));
    }
    public void find_Area(double a){
        System.out.println("Area of the circle = " +(3.14*a*a));
    } 
}
