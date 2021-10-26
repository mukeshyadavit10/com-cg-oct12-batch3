package com.cg.oct12.batch.day4;

public class EmployeeDemo {
	int id;
	String name;
	double salary;

	Employee() {
		System.out.println("Employee constructor");
	public Employee() {
		System.out.println("zero-args constructor");

	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		System.out.println("parameterized constructor");
	}




	public static void main(String[] args) {

		emp2.name = "Ajeet";
		emp2.salary = 10.6;
		System.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);

		Employee emp3 = new Employee(103, "Sonu", 12.75);
		System.out.println(emp3.eid + " " + emp3.name + " " + emp3.salary);
	}

		

	}

}
