/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
10. Write a Java Program to implement the Interface using Abstract Class.
 */
interface InterfaceDemo{
    public void meth1();
    public void meth2();
    public void meth4();
}
// The methods of the interface can be implementd in the abstract class or they 
// can be declared as abstract methos inside the abstarct class
abstract class AbstractDemo implements InterfaceDemo{
    // Methods 1 and 2 of interface have been implemented
    // Method 4 of interface has been declared as abstract
    @Override
    public void meth1(){
        System.out.println(" The method1 of interface implemented in abstract class");
    }
    @Override
    public void meth2(){
        System.out.println(" The method2 of interface implemented in abstract class");
    }
    
    @Override
    public abstract void meth4();
    // New abstarct method
    public abstract void meth3();
}
class InherAbstractDemo extends AbstractDemo{
    // All the abstract methods of abstract class have to be implemented in the inheriting class 
    @Override
    public void meth3(){
    System.out.println("The abstract method 3 of abstract class implemented in child class");
}
    @Override
    public void meth4(){
    System.out.println("The abstract method 4 of abstract class implemented in child class");
}
}
public class InterfaceUsingAbstractClass {
    public static void main(String []args){
    InherAbstractDemo iad = new InherAbstractDemo();
    iad.meth1();
    iad.meth2();
    iad.meth3();
    iad.meth4();
}
}
