package example;
import java.util.Scanner;

public class ReverseOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter any number:");
int n= sc.nextInt();

int r=0;
 while(n!=0) {
	 int a;
	 a=n%10;
	 r=r*10 + a;
	 n=n/10;
 }
 

	 System.out.println("The reverse of the number is:"+r);
 

	}

}
