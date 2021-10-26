package com.cg.oct12.batch.day5.Inheritance.abc;
//abstract and concrete 

//interface 

//abstract method - 
//has the keyword abstract 
//has only method signature 
//does not have method body 
//can be defined in abstract class 
//can not be defined in concrete class 

//abstract class 
//has the keyword abstract 
//object can not be created 
//can contain zero or more abstract methods 
//can contain zero or more concrete methods 
//can also contain both 

//interface 
//mainly contain abstract methods 
//from java 8, also contain static and default methods 
//allow multiple inheritance in java 


interface FinanceMinistry {

	public abstract void payInterestOnDeposits();

}

interface StateGovt {

	public abstract void paySalaryToEmployees();

}



abstract class Rbi
{
public abstract void doKyc();
	
	void openAccount()
	{
		
	}
	
	void payLoans() 
	{
		
	}
}
	
class HdfcBank extends Rbi implements FinanceMinistry, StateGovt {

	
	public void doKyc()
	{
		System.out.println("Aadhar Card ");
	}

	@Override
	public void paySalaryToEmployees() {
		System.out.println("Salary");
		
	}

	@Override
	public void payInterestOnDeposits() {
		System.out.println("Interest");
		
	}
	
}
 class IciciBank extends Rbi
 {
	public void doKyc()
	 {
	 System.out.println("Pan Card "); 
	 }
 }
public class App {

	public static void main(String[] args) {
		HdfcBank obj = new HdfcBank();
		obj.doKyc();
		obj.openAccount();
		obj.payLoans();
		obj.paySalaryToEmployees();
		obj.payInterestOnDeposits();
		IciciBank obj2 = new IciciBank();
		obj2.doKyc();

//		Rbi obj3 = new Rbi();
	}

	}


