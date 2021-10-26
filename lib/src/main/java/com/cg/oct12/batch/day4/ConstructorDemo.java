package com.cg.oct12.batch.day4;

class Employee {

	int eid;
	String name;
	double salary;

	public Employee() {
		super();
		System.out.println("zero-args constructor");
	}

	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
		System.out.println("2 parameterized constructor");
	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		System.out.println("3 parameterized constructor");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

//	public String toString() {
//		return "Blah Blah Blah";
//	}

}

public class ConstructorDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.eid = 101;
		emp.name = "Jeevan";
		emp.salary = 10.5;
//		System.out.println(emp.eid + " " + emp.name + " " + emp.salary);
		System.out.println(emp.toString());

		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.name = "Ajeet";
		emp2.salary = 10.6;
//		System.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);
		System.out.println(emp2.toString());

		Employee emp3 = new Employee(103, "Sonu", 12.75);
//		System.out.println(emp3.eid + " " + emp3.name + " " + emp3.salary);
		System.out.println(emp3.toString());
	}
}