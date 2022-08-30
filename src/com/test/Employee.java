package com.test;
public class Employee { 
	private int id ;
	private String firstName;
	private String lastName;
    private int salary;
	Employee()
	{
	}
	
	public Employee(int id,String firstName,String lastName,int salary)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String getName() {
		return this.firstName+ " "+this.lastName;
	}
	
	public int getAnnualSalary(){
		
		return this.salary*12;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public int raiseSalary(int percent) {
		return this.salary=this.salary + ((this.salary*percent)/100);
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	 
	public static void main(String[] args)
	{ 
		Employee emp = new Employee(150,"Hemalatha","Choudhary",30000);

	
		System.out.println("The Employee Id is"+ " " + emp.getId());
		System.out.println("The Employee Name is"+ " " + emp.getName());
		System.out.println("The Employee Salary is"+ " " + emp.getSalary());
		System.out.println("The Employee AnnualSalary is"+ " " + emp.getAnnualSalary());
		System.out.println("The Employee RaisedSalary is"+ " "+ emp.raiseSalary(7)) ;
		
	}
}
		
		
	
		
		
	



	


