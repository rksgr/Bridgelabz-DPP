//import EmpWageComputUC1.java;
//import EmpWageComputUC2.java;
public class EmpWageComputUC5{
	public int noOfDaysPres(){
		int no_of_days_pres = 0;
		for (int i=0;i<20;i++)
		{
			EmpWageComputUC1 ewc1 = new EmpWageComputUC1();
			if (ewc1.empIsPresent()==true){
				no_of_days_pres++;
				}
		}
		return no_of_days_pres;
	}
	public int dailyWage(){
		EmpWageComputUC2 ewc2 = new EmpWageComputUC2();
		int daily_wage = ewc2.dailyEmpWage();
		return daily_wage;
	}
	public static void main(String [] args){
	EmpWageComputUC5 ewc5 = new EmpWageComputUC5();
	int per_day_sal = ewc5.dailyWage();
	int tot_days_pres = ewc5.noOfDaysPres();
	System.out.println("Salary of each day of the employee = " + per_day_sal);
	System.out.println("The employee is present for "+ tot_days_pres + " days");
	System.out.println("The total wage of a month of the employee = "+per_day_sal*tot_days_pres);
	}
}
