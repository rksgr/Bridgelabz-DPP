public class EmpWageComputUC3{
	public int addPartTimeEmpWage(){
		int part_time_hr =8;
		int wage_per_hr = 20;
		int part_time_wage = wage_per_hr * part_time_hr;
		return part_time_wage;
		}
	public static void main(String [] args){
		EmpWageComputUC3  ewc3 = new EmpWageComputUC3();
		System.out.println("The part time wage of the employee = "+ ewc3.addPartTimeEmpWage());
		}
	}
