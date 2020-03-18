package examples;

public class Employee {
	
	//instance variables
	String name;
	int age;
	double salary;
	String designation;
	
	//constructor to set name
	public Employee(String empName) {
		this.name= empName;
	}
	//method to set age
	public void empAge(int empAge) {
		age=empAge;
	}
	//method to set salary
	public void empSalary(double empSalary) {
		salary=empSalary;
	}
	//method to set employee designation
	public void empDesignation(String design) {
		designation=design;
	}
	//to print details of the employees
	public void empDetails() {
		System.out.println("Employee name:"+name);
		System.out.println("Employee age:"+age);
		System.out.println("Employee desingation:"+designation);
		System.out.println("Employee salary:"+salary);
		
	}
	

}
