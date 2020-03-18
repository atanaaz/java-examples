package example;

import java.util.Scanner;

public class Customer {
	private int amount;
	private String CName;

	public Customer(String Name, int amount) {
		this.CName=Name;
		this.amount=amount;
	}
	
	public void setAmount(int amount) {
		this.amount=amount;
	}
	
	public String getCName() {
		return CName;
	}
	
	public int getAmount() {
		return amount;
	}
	

	
			
	
	

}