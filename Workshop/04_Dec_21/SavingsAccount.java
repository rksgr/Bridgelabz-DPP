public class SavingsAccount {
    public static double annualInterestRate;
    private double savingsBalance;
    // Use getter and setter to change private fields
    public double getsavingsBalance(){
        return savingsBalance;
    }
    public void setsavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    
    public double calculateMonthlyInterest(){
        double monthlyInterest = savingsBalance*annualInterestRate/12;
        return monthlyInterest;   
    }
    public static void modifyInterestRate(double annualInterestRate){
        SavingsAccount.annualInterestRate = annualInterestRate;
    } 
}

