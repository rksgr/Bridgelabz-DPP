/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
9. Write a Java program where the shape is the abstract class, and its 
* implementation is provided by the Rectangle and Circle classes.
 */
abstract class Shape{
    // Methods without their body
    public abstract void area();
    public abstract void perimeter();
}
class Rectangle extends Shape{
    // Implementation of all the methods of abstract class provided in the class
    // which inherits the abstarct class
    @Override
    public void area(){
        int len = 5, brth = 8;
        System.out.println("The area of the rectangle = " +(len*brth));
    }
    @Override
    public void perimeter(){
        int len = 5, brth = 8;
        System.out.println("The perimeter of the rectangle = " + 2*(len+brth));
    }
}
class Circle extends Shape{
    // Implementation of all the methods of abstract class provided in the class
    // which inherits the abstarct class
    @Override
    public void area(){
        int radius = 8;
        double pi = 3.14;
        System.out.println("The area of the Circle = " +(pi*radius*radius));
    }
    @Override
    public void perimeter(){
        int radius = 8;
        double pi = 3.14;
        System.out.println("The perimeter of the circle = " + 2*pi*radius);
    }
}
public class ShapeAbstractClass {
    public static void main(String []args){
        Circle ci = new Circle();
        ci.area();
        ci.perimeter();
        Rectangle rct = new Rectangle();
        rct.area();
        rct.perimeter();
    }
}
