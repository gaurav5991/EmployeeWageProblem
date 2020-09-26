public class EmployeeWage implements computeEmpWageInterface
{

	public static final int IS_PART_TIME = 1;

	public static final int IS_FULL_TIME = 2;
		
	private int numOfCompany = 0;
	
	private CompanyEmpWage[] companyEmpWage;
		
	public EmployeeWage() 
	{
		companyEmpWage = new CompanyEmpWage[5];
	}
		
	public void addCompanyEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth)
	{
		companyEmpWage[numOfCompany] = new CompanyEmpWage(companyName, empRatePerHour, numOfWorkingDays, maxHrsInMonth);
		
		numOfCompany++;
	}	
	
	public void computeWage()
	{
		for(int i=0;i<numOfCompany;i++)
		{
			companyEmpWage[i].setTotalEmpWage(this.computeWage(companyEmpWage[i]));
			System.out.println(companyEmpWage[i]);
		}
	}
	
	
	public int computeWage(CompanyEmpWage companyEmpWage)
	{
		int empHrs =  0;
		
		int  totalEmpHrs = 0;

		int totalWorkingDays = 0;

		while(totalEmpHrs <=companyEmpWage.maxHrsInMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays)
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
		
		 return totalEmpHrs * companyEmpWage.empRatePerHour;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		
		EmployeeWage empWageObj = new EmployeeWage();
		empWageObj.addCompanyEmpWage("DMart", 20, 2, 10);
		empWageObj.addCompanyEmpWage("Coca-Cola", 10, 4, 20);
		empWageObj.computeWage();
	}
}
