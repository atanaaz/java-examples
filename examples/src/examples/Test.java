package examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
	
	public static void main(String args[]) {
		
        List l = new ArrayList();
        
        l.add(1);
        l.add(2);
        
        System.out.println(l.get(2));
        
      List l1 = new LinkedList();
        
        l1.add(1);
        l1.add(2);
        
        System.out.print(l1.get(3));
		System.out.print("I love luckman");
		
		Human arshia = new Human();
		arshia.setAge(25);
		arshia.setName("Arshia1");
		
		
		Human luckman = new Human();
		luckman.setAge(31);
		luckman.setName("Luckman1");
		
		System.out.println("arshia"+arshia.getName());
		System.out.println("Luckman"+luckman.getName());
		
		System.out.println(Util.getTime());
		
		Customer c = new Customer();
		c.setName("Arshia");
		//c.order="pizza";
		
		Customer c2 = new Customer();
		c2.setName("Luckman");
		//c2.order="fries";
		
		
		Customer c1 = new Customer();
		c1.setName("123456");
		//c1.setorder="fries";
		
		System.out.println("c"+c.getName());
		
		System.out.println("c1"+c1.getName());
		System.out.println("c2"+c2.getName());
		
		
		
		
		
	}

}
