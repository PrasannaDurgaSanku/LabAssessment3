class HourlyEmp extends CompanyDetails
{
	private int hoursal=1,noOfhour;
	
 	public void salaryupdate(int update)
 	{
		this.hoursal=update;
 	}

	public HourlyEmp(int noOfhour) 
	{
	
		this.noOfhour =noOfhour;
  	}

	public void salarycall()
	{
		salary=(hoursal*noOfhour);
	}
	


}