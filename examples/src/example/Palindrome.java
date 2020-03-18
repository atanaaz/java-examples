package example;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to check palindrome or not:");
		int n=sc.nextInt();
		int r=0;
		int p=n;
		while(n!=0) {
			int a;
			a=n%10;
			r=r*10 + a;
			n=n/10;
		}
		
		if(r==p) {
		System.out.println("The number is palindrome!");
		}
		else {
			System.out.println("The number is not palindrome.");
		}
		
	}

}
