/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
5. Write a Java program to implement interface inheritance.
 */
interface Animal{
    public void speed();
    public void strength();
}

// Interface LandAnimal extends the interface Animal
// All the methods of interface Animal are overriden in interface LandAnimal 
interface LandAnimal extends Animal{
    @Override
    public void speed();
    
    @Override
    public void strength();
}

// Class Elephant implements LandAnimal
// All the methods of interface LandAnimal are overriden in class Elephant  
class Elephant implements LandAnimal{
    @Override
    public void speed(){
        System.out.println("Elephant moves at a slow speed");
    }
    @Override
    public void strength(){
        System.out.println("Elephant has a high strength");
    }
}
public class InterfaceInheritance {
    public static void main(String []args){
        Elephant eph = new Elephant();
        eph.speed();
        eph.strength();
    }
}
