public class EmpWageComputUC6{
	public int empWageCond(){
		int days=0;
		int wrkg_hrs=0;
		int tot_wage=0;
		while ((wrkg_hrs<100)  && (days<30)){
			EmpWageComputUC1 ewc1 = new EmpWageComputUC1();
			if (ewc1.empIsPresent()==true){
				EmpWageComputUC2 ewc2 = new EmpWageComputUC2();
				tot_wage = tot_wage + ewc2.dailyEmpWage();
				wrkg_hrs+=8;
				}			
			days++;
			}
		return tot_wage;
		}
	public static void main(String [] args){
		EmpWageComputUC6 ewc6 = new EmpWageComputUC6();
		System.out.println("The total wages of employee under given conditions = " + ewc6.empWageCond());
		}
	}


