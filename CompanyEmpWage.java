public class CompanyEmpWage
{
	public final String companyName;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHrsInMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth)
	{
		this.companyName = companyName;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	@Override
	
	public String toString()
	{
		return "Total Employee Wage for Company: " + companyName + " is: " + totalEmpWage;
	}
}
