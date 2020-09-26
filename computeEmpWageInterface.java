public interface computeEmpWageInterface 
{
	public void addCompanyEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsInMonth);
	public void computeWage();
	public int getTotalWage(String company);
}
