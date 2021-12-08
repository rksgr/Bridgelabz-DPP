public class EmpWageComputUC1{

	public boolean empIsPresent(){
		double emp_attend = Math.floor(Math.random()*10)%2;
		boolean emp_is_pres;
		if (emp_attend==1){
			emp_is_pres = true;
			} else{
			emp_is_pres = false;
			}
		return emp_is_pres;
		}
	public static void main(String []args){
		EmpWageComputUC1 ewc1 = new EmpWageComputUC1();
		if (ewc1.empIsPresent()==true){
			System.out.println("The employee is present");
			}
		else{ System.out.println("The employee is absent");
			}
		}
	}
