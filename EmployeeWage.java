public class EmployeeWage
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation program");
	
		int IS_FULL_TIME = 1;
		
		int WAGE_PER_HOUR = 20;		
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
		
		int empHrs =  0;
		
		int empWage = 0;

		if(empCheck == IS_FULL_TIME)
		{
			empHrs = 8;
		}
		else
		{
			empHrs = 0;
		}
		empWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Employee Wage: " + empWage);
	}
}