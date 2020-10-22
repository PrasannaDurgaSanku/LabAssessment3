class CommissionEmp extends CompanyDetails 
{
	int paidsal,totalsal,per=1;
	
	public Commission(int paidsal, int totalsal) 
	{
		this.paidsal = paidsal;
		this.totalsal = totalsal;
	}


	public void salaryupdate(int update)
	{
		this.per=update;
	}
	public void salarycall()
	{
		salary=(paidsal*totalsal*per/100);
	}

	
}