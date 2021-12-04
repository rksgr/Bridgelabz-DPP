public class MyOwnAutoShop {
    public static void main(String []args){
        Sedan sd = new Sedan();    // new instance of Sedan class
        sd.length = 21;
        sd.manufacturerDiscount = 5; 
        Ford fd1= new Ford(); // new instance of Ford class
        fd1.year = 2017;
        fd1.manufacturerDiscount = 12;
        Ford fd2 = new Ford();   // new instance of Ford class
        fd2.year = 2019;
        fd2.manufacturerDiscount = 14;
        
        Car cr = new Car();   // new instance of Car class
        cr.color = "Red";
        cr.regularPrice = 2000;
        cr.speed = 75;
        // Display Sale Prices of all instance
        System.out.println("The Sale price of Car = "+ cr.getSalePrice(10.2));
        System.out.println("The Sale price of Sedan = "+ sd.getSalePrice());
        System.out.println("The Sale price of Ford1 = "+ fd1.getSalePrice(11,fd1.manufacturerDiscount));
        System.out.println("The Sale price of Ford2 = "+ fd2.getSalePrice(11,fd2.manufacturerDiscount));    
    }
}
