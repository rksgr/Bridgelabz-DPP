/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
1. Write a Program to define the Default constructor (no-arg constructor) 
* and Parameterized constructor.
 */
public class Constructor {
    // Default constructor
    public Constructor(){
        System.out.println("Default constructor");
    }
    // parameterized contructor
    public Constructor(int a, int b){
        System.out.println("Parameterized constructor");
        System.out.println("a= "+a + " b = " +b);
    }
    public static void main(String []args){
        // Default constructor called
        Constructor c = new Constructor();
        // Parameterized constructor called
        Constructor c1 = new Constructor(2,8);
    }
}
