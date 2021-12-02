/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
2. Write a Java program to access the interface fields.
 */
interface AccessFieldsDemo{
    // Methods without implementation
    void method1();
    void method2();
    void method3();
}
class ImpAccessFieldsDemo implements AccessFieldsDemo{
    // The methods of interface implemented in this class
    @Override
    public void method1(){
        System.out.println("Method1 accessed");
    }
    @Override
    public void method2(){
        System.out.println("Method2 accessed");
    }
    @Override
    public void method3(){
        System.out.println("Method3 accessed");
    }
    
}
public class AccessInterfaceFields {
  public static void main(String []args){
      ImpAccessFieldsDemo afd = new ImpAccessFieldsDemo();
      afd.method1();
      afd.method2();
      afd.method3();
  }
}
