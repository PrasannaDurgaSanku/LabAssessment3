import java.util.ArrayList;

import java.util.Scanner;

abstract class CompanyDetails
{
	
	int salary;

	String name,dept,id,companyname;
	
	public abstract void salarycall();
	public abstract void salaryupdate(int update);
	public void display()
	{
		System.out.println(salary);
	}
	public void setdata(String name, String dept, String id, String companyname) {
		this.name=name;
		this.id=id;
		this.dept=dept;
		this.companyname=companyname;
		
		
	}
	
}
public class EmployeeRecord 
{

	public static void main(String[] args) 
	{
			
	ArrayList<CompanyDetails> employeetype = new ArrayList<CompanyDetails>(3);
	employeetype.add(new SalariedEmp());
	employeetype.add(new HourlyEmp(20));
	employeetype.add(new CommissionEmp(10,20));
	
	}
}
	
	