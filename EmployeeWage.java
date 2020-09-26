import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeWage implements computeEmpWageInterface
{

	public static final int IS_PART_TIME = 1;

	public static final int IS_FULL_TIME = 2;
	
	private ArrayList<CompanyEmpWage> companyEmpWageList;
	private HashMap<String, CompanyEmpWage> companyEmpWageMap;
		
	public EmployeeWage() 
	{
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
		
		companyEmpWageMap = new HashMap<>();
	}
		
	public void addCompanyEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth)
	{
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, empRatePerHour, numOfWorkingDays, maxHrsInMonth);
		
		companyEmpWageList.add(companyEmpWage);
		
		companyEmpWageMap.put(companyName, companyEmpWage);
	}	
	
	public void computeWage()
	{
		for(int i=0;i<companyEmpWageList.size();i++)
		{
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	@Override
	
	public int getTotalWage(String company)
	{
		return companyEmpWageMap.get(company).totalEmpWage;
	}
	
	public int computeWage(CompanyEmpWage companyEmpWage)
	{
		int empHrs =  0;
		
		int empWage = 0;
		
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
			companyEmpWage.setEmpWage(companyEmpWage.empRatePerHour * empHrs);
			totalEmpHrs += empHrs;
			System.out.println("Days: " + totalWorkingDays + " Emp Hr: " + empHrs);
			System.out.println("Daily Wage for Day "+ totalWorkingDays + " is: " +companyEmpWage.empRatePerHour * empHrs);
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
		
		System.out.println("Total Wage for DMart Company: " + empWageObj.getTotalWage("DMart"));
	}
}
