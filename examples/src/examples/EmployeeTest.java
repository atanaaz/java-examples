package examples;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instantiating objects
		Employee a= new Employee("Arshia");
		Employee b= new Employee("Luckman");
		
		//assigning values to object a
		a.empAge(25);
		a.empDesignation("Data Scientist");
		a.empSalary(80000);
		a.empDetails();
		
		//assigning values to object b
				b.empAge(31);
				b.empDesignation("Developer");
				b.empSalary(120000);
				b.empDetails();
		
		
		
		
	}

}
