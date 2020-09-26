public class EmployeeWage
{

	public static final int IS_PART_TIME = 1;

	public static final int IS_FULL_TIME = 2;
		
	private final String companyName;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHrsInMonth;
	private int totalEmpWage;
		
	public EmployeeWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth)
	{
		this.companyName = companyName;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}
		
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		
		EmployeeWage dMart = new EmployeeWage("Dmart", 20, 2, 10);
		System.out.println("DMart");
		dMart.computeWage();
		EmployeeWage CocaCola = new EmployeeWage("Coca-Cola", 10, 4, 20);
		System.out.println("Coca-Cola");
		CocaCola.computeWage();
	}
	
	public void computeWage()
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
		totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Employee Wage for Company "+companyName + " is: " + totalEmpWage);
	}
}
