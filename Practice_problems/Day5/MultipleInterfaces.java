/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
4. Write a Java program that demonstrates multiple interfaces.
 */

interface MulInterface1{
    // Methods without body
    void meth1();
    void meth2();
    void meth3();
}
interface MulInterface2{
    // Methods without body
    void meth4();
    void meth5();
}
//Multiple interfaces implemented in the following class
class ImpMultipleInterfaceDemo implements MulInterface1, MulInterface2{
    // The methods of both interfaces are being overriden
    @Override
    public void meth1(){
        System.out.println("Accessing method 1");
    }
    @Override
    public void meth2(){
        System.out.println("Accessing method 2");
    }
    @Override
    public void meth3(){
        System.out.println("Accessing method 3");
    }
    @Override
    public void meth4(){
        System.out.println("Accessing method 4");
    }
    @Override
    public void meth5(){
        System.out.println("Accessing method 5");
    }
}
public class MultipleInterfaces {
    public static void main(String []args){
     ImpMultipleInterfaceDemo imid = new ImpMultipleInterfaceDemo();
     imid.meth1();
     imid.meth2();
     imid.meth3();
     imid.meth4();
     imid.meth5();
    }
}
