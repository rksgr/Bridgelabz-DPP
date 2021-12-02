/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
7. Write a Java program that demonstrates the final keyword - final variable, 
* final method, and final class
 */
class FinalKeywordDemo{
    // Given instance variable is not final
    private int no_class = 7;
    // Instance variable declared final
    private final int no_studts = 21;
    
    // A method which is not declared as final
    public void studentsPerfor(int good_perform){
        System.out.println("The number of students performing at good level =" + good_perform);
    }
    // A method declared as final
    public final void studentsDistance(int stud_short_dist){
        System.out.println("The number of students travelling short distance =" + stud_short_dist);
    }

    // The setter can be used to change a class variable 
    public void setno_class(int new_no_class){
        // Shows error cannot assign value to final variable
        this.no_class = new_no_class;
    }
    // The instance variable declared final cannot ve assigned a new value using setter
    public void setno_studts(int new_stud){
        // Shows error cannot assign value to final variable
        //this.no_studts = new_stud;
    }
    // The getter can be used to fetch an instance variable 
    public int getno_class(){
        System.out.println("The number of classes in the school = " + this.no_class);
        return this.no_class;
    }
    // The instance variable declared final can be feched using getter
    public int getno_studts(){
        System.out.println("The number of students in the class =" + this.no_studts);
        // Shows error cannot assign value to final variable
        return this.no_studts;
    }
}
class FinalDemo extends FinalKeywordDemo{
    
    // Overriding of the method not declared as final in Superclass 
    @Override
    public void studentsPerfor(int poor_perform){
        System.out.println("The number of students performing poorly =" + poor_perform);
    }
    // Error: Overiding of the method declared as final not possible
    @Override
    public void studentsDistance(int stud_short_dist){
        //super.studentsDistance(98);
        System.out.println("The number of students travelling very short distances =" + stud_short_dist);
    }
}
final class DeclaredFinal{
    public void method1(){
    System.out.println("The class declared as final cannot be inherited");
}
}

// Error cannot inherit from DeclaredFinal class, a class declared as  final
class ChildClass extends DeclaredFinal{
    public method2(){
        System.out.println("The child class cannot extend a class declared as final");
    }
}

public class FinalKeyword {
    public static void main(String [] args){
        FinalDemo fd = new FinalDemo();
        fd.setno_class(55);
        fd.getno_class();
        // setno_studts Shows error cannot assign value to final variable
        fd.setno_studts(77);
        fd.getno_studts();
        fd.studentsDistance(10);
        fd.studentsPerfor(16);
    }
}
