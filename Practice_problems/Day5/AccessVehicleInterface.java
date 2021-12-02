/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
6. Write a Java program that designing a vehicle’s engine using an interface 
* that is implemented in Class.
 */
// interface contains vehicle design parameters
interface VehicleEngineInterface{
    void ccOfEngine();
    void engineMake();
}
// implements methods  of above interface
class ImpVehicleEngineInterface implements VehicleEngineInterface{
    int year = 2017;
    int engine_cap = 500;
    @Override
    public void ccOfEngine(){
        System.out.println("The CC of the Engine = " + this.engine_cap );
    }
    @Override
    public void engineMake(){
       System.out.println("The make of the Engine is " +this.year); 
    }
}
public class AccessVehicleInterface {
    public static void main(String []args){
        // create an instance of the class(which implements methods of the interface)
        // to access methods of the interface
        ImpVehicleEngineInterface vei = new ImpVehicleEngineInterface();
        vei.ccOfEngine();
        vei.engineMake();
    }
}
