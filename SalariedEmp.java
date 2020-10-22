class SalariedEmp extends CompanyDetails 
{
	private int weeksal=50;
	
	public void salaryupdate(int update)
	{
		this.weeksal=update;
	}

	public void salarycall()
	{
		salary=weeksal;
	}
	
	

}
