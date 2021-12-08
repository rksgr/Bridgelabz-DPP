public class EmpWageComputUC2{
	public static void main(String [] args){
		EmpWageComputUC1 ewc1 = new EmpWageComputUC1();
		EmpWageComputUC2 ewc2 = new EmpWageComputUC2();
		System.out.println("The daily wage of the employee = " + ewc2.dailyEmpWage());		
		}
	public int dailyEmpWage(){
		int wage_per_hr = 20;
		int full_day_hr = 8;
		int daily_emp_wage = wage_per_hr*full_day_hr;
		return daily_emp_wage;
		}
	}
