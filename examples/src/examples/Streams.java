package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Streams {

	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<Integer>();
		l.add(1);
		l.add(6);
		l.add(3);
		l.add(7);
		
		System.out.println(l);
		
		l.stream().forEach((i)->System.out.println(i));
		
		Consumer<Integer> c= (i)->System.out.println(i);
		c.accept(6);
	}

}
