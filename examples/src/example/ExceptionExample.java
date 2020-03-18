package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ExceptionExample {

	public static void main(String args[]) {
		Maths m = new Maths();
		
		Employee e1 = new Employee(25,"Arshia");
		
		e1.getAge();
		e1.getName();
		
		Employee e2 = new Employee(25,"Luckman");
		
		e2.getAge();
		e2.getName();
		
		
	   Employee e3 = new Employee(2,"Minha");
		
		e3.getAge();
		e3.getName();
		
		List<Employee> l = new ArrayList();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		for(Employee e:l) {
			if(e.getName().equals("Arshia"))
				System.out.println(e.getName()+ " "+e.getAge());
		}
		
		
		Map<String,Integer> m1 = new HashMap(); 
		m1.put(e1.getName(), e1.getAge());
		m1.put("l",1);
		m1.put("l",2);
		m1.put(e2.getName(), e2.getAge());
		m1.put(e3.getName(), e3.getAge());
		
		System.out.println("Luckman"+" "+m1.get("Luckman"));
		System.out.println(m1.get("l"));
		
		for(Entry<String,Integer> e:m1.entrySet()) {
			System.out.println("enteries"+e.getKey()+" "+e.getValue());
			
		}
		
		
		for( String e:m1.keySet()) {
			System.out.println("key"+"e" + " "+e);
			
		}
		
		for( Integer e:m1.values()) {
			System.out.println("values"+"e" + " "+e);
			
		}
		 
		try {
			System.out.println("Arshia's" + m.division(0, 1));
			System.out.println("Luckman's"+m.division(10, 1));
		} catch (ServiceException e) {
			System.out.println(e.getMessage() + " code " +e.getCode());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
