public class Car {
    int speed;
    double regularPrice;
    String color;
    public double getSalePrice(double discount){
        double salePrice;
        salePrice = this.regularPrice - (discount*(this.regularPrice)/100);
        return salePrice;
    }
}
class Truck extends Car{
    int weight;  
    public double getSalePrice(){
        double discount;
        if (this.weight >2000){
            discount = 10;
        }
        else {
            discount = 20;
        }
        double salePrice = regularPrice - (discount*regularPrice/100);
        return salePrice;
    }
    
}
class Ford extends Car{
    int year;
    int manufacturerDiscount;
    Ford(){
        super.speed= 95;
        super.color = "Green";
        super.regularPrice= 7000;
    }
    public double getSalePrice(double discount,int manufacturerDiscount ){
        double salePrice = regularPrice - (discount*regularPrice/100)- 
                (manufacturerDiscount*regularPrice/100) ;
        return salePrice;
    }   
}

class Sedan extends Car{
    int length;
    int manufacturerDiscount;
    Sedan(){
        super.speed=125;
        super.color= "red";
        super.regularPrice=9000;
    }
    
    public double getSalePrice(){
        double discount;
        if (this.length >2000){
            discount = 10;
        }
        else {
            discount = 20;
        }
        double salePrice = regularPrice - (discount*regularPrice/100);
        return salePrice;
    }  
}
