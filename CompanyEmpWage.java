public class CompanyEmpWage 
{
	public final String companyName;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHrsInMonth;
	public int totalEmpWage;
	public int empWage;
	
	
	public CompanyEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth)
	{
		this.companyName = companyName;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
		totalEmpWage = 0;
		empWage = 0;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	

	public void setEmpWage(int empWage) {
		this.empWage = empWage;
	}

	@Override
	
	public String toString()
	{
		return "Total Employee Wage for Company: " + companyName + " is: " + totalEmpWage;
	}
}
