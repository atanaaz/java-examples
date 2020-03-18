package examples;
import java.util.*;
public class Reverse {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        int n= sc.nextInt();
	        int d= sc.nextInt();
	        System.out.println(n);
	        int[] a= new int[n];

	        for(int i=0; i<n; i++){

	            int b= sc.nextInt();
	             a[i]= b;
	            
	            System.out.print(a[i] +", ");
	           
	        }
	        
	        int b[]= new int[n];
	       
	        for(int i=0; i<=n-1; i=i++)
	        {
	        	if(i<d) {
	            b[i]=a[i+n-d];
	        	}
	        	else {
	        		b[i]=a[i-d];
	        	}
	        	
	            
	            System.out.print(b[i] +", ");
	        }

	        
	      }
	}
	

