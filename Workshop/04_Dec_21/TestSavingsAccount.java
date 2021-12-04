
public class TestSavingsAccount {
 public static void main(String []args){
     SavingsAccount saver1 = new SavingsAccount();
     saver1.setsavingsBalance(2000);
     double balance1 = saver1.getsavingsBalance();
     saver1.modifyInterestRate(4.5);
     double interest1 = saver1.calculateMonthlyInterest();
     System.out.println(" The savings balance for user1 = $"+(balance1+interest1));
     //saver1.setsavingsBalance(balance1+interest1);
     
     SavingsAccount saver2 = new SavingsAccount();
     saver2.setsavingsBalance(3000);
     double balance2 = saver2.getsavingsBalance();
     saver2.modifyInterestRate(4.5);
     double interest2 = saver1.calculateMonthlyInterest();
     System.out.println(" The savings balance for user2 = $"+(balance2+interest2));
 }   
}
