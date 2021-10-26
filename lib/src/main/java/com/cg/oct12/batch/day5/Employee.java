package com.cg.oct12.batch.day5;

public class Employee {
	
	private int eid;
	private String firstName;
	private double salary = 8000;
	
	public int getEid() {
		return eid;
	}
	public Employee(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}
	
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirstName() {
		return firstName;                                          //ridht click->source->
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + ", getEid()=" + getEid()
				+ ", getFirstName()=" + getFirstName() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}

	

	 // read-only field

//	public double getSalary() {
	//	return this.salary;
	//}
// public void setSalary(double salary)
 //{
	// this.salary=salary;
 //}
//}
