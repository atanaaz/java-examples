package example;
import java.util.*;

public class BankApplication {
	
	
	
	
	public static void withdraw(Customer c){
		Scanner sc=new Scanner(System.in);
		if (c.getAmount()>500) {
			System.out.println("Please enter the amount you wish to withdraw");
			int a=sc.nextInt();
			
			int bal=c.getAmount();
			
			if(bal>=500 && (bal-500)>=a) {
				bal=c.getAmount()-a;
				c.setAmount(bal);
				System.out.println("Transaction occured successfully");
				System.out.println("Your account now has a balance of: $"+(bal-500));
			}
			else {
				System.out.println("You can withdraw only upto:"+(bal-500));
			}
			
		}
		else {
			System.out.println("Your account has a balance of: $"+(c.getAmount()-500));
				System.out.println("Your account has insufficient balance, Please deposit a mimimum of $"+ (500-c.getAmount())+" to maintain your account");
				}
			
		}
	
	public static void deposit(Customer c){
		Scanner sc=new Scanner(System.in);
		 
			System.out.println("Please enter the amount you wish to deposit");
			int a=sc.nextInt();
			int bal=c.getAmount()+a;
			System.out.println("Transaction occured successfully");
			c.setAmount(bal);
			
	if((bal-500)>0) {
				System.out.println("Your account now has a balance of: $"+(bal-500));
	}
	else {
				System.out.println("You need to deposit $"+(500-bal)+" to be able to make transactions");
			}
			
		
		}
	
	public static void end() {
		System.out.println("Application ended");
		
	}
	

	public static void main(String args[]) {
		Customer c1=new Customer("Anish",600);
		Customer c2=new Customer("Basha",400);
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("Welcome to the Bank application!");
		System.out.println("Please enter the customer's name");
		String Name=sc.next();
		
		Customer c;
		String b;
		
		if(Name.equals(c1.getCName())) {
			c=c1;
			System.out.println("Welcome "+c1.getCName());
		}
		else if(Name.equals(c2.getCName())){
			 c=c2;
			System.out.println("Welcome "+c2.getCName());
		}
		else {
			c=null;
			System.out.println("Customer not found");
		}
		
		if(c!=null) {
		
		do  {
		System.out.println("What action do you want to perform:" + "\n Withdraw (w)"+"\n Deposit (d)");
		
		String s=sc.next();
		
		if(s.equals("w")) {
			withdraw(c);
			
			
		}
		else if(s.equals("d")) {
			deposit(c);
		}
		else {
			System.out.println("Please enter a valid response: Type w for withdrawl and d for deposit.");
		}
		
		System.out.println("Do you wish to continue banking, type y or n");
		b=sc.next();
		}while(b.equals("y"));
		
		end();
		}
		else {
		end();
		}
		}while(1>0);
		
		
	}
}

