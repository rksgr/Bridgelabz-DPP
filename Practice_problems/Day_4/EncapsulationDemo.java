/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 3. Write a Program to demonstrate the Java Encapsulation.
 * To access private variables we have to use getter and setter.
*/
class TestAlpha{
    int a = 20;
    private int c = 10;
}
class TestBeta{
  private int b =30;  
  public int getB(){
      return b;
  }
  public void setB(int b){
      this.b  = b;
  }
}
public class EncapsulationDemo {
    public static void main(String []args){
    TestAlpha ta = new TestAlpha();
    System.out.println(ta.a);
    //If the below commented code is executed it will cause compile time error.
    //System.out.println(ta.c);
    
    TestBeta tb = new TestBeta();
    // To set the private variable of class TestBeta, need to use setter method
    tb.setB(37);
    // To get the private variable of class TestBeta, need to use getter method
    System.out.println(tb.getB());
    }
}
