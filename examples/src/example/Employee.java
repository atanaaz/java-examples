package example;

public class Employee {
	
	private int age;
	private String  name;
	
	Employee(int age, String name){
		this.age=age;
		this.name =name;
	}
	
	public int getAge() {	
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}

}
