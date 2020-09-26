public class EmployeeWage
{

		public static final int IS_PART_TIME = 1;

		public static final int IS_FULL_TIME = 2;

		public static final int EMP_RATE_PER_HOUR = 20;		
		
		public static final int NUM_OF_WORKING_DAYS = 20;
	
		public static final int MAX_HRS_IN_MONTH = 100;
		
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		
		computeWage("Coca-Cola", 20, 2, 10);
		computeWage("DMart", 10, 4, 20);
	}
	
	public static void computeWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth)
	{
		int empHrs =  0;
		
		int  totalEmpHrs = 0;

		int totalWorkingDays = 0;

		while(totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays)
		{

			totalWorkingDays++;

			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			
			switch (empCheck)
			{
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
			}

			totalEmpHrs += empHrs;
			System.out.println("Days: " + totalWorkingDays + " Emp Hr: " + empHrs);

		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Employee Wage for Company: "+companyName + " is: " + totalEmpWage);
	}
}