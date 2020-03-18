package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	
	
	public static void main(String args[]) {
		int n = 10;
		int [] a= {10,20,30,10,20,30,10,20,30,30};
		Map<Integer, Integer> m = new HashMap();
		for(int i=0; i <a.length; i++) {
	     if(m.containsKey(a[i])) {
	    	Integer count = m.get(a[i]);
	    	m.put(a[i],++count);
	     } else {
	    	 m.put(a[i], 1);
	     }
		}
		
		int count=0;
	    for(int s:m.values()) {
	    	int temp=s/2;
	    	count = count + temp;
	    }
		
		System.out.print(count);
	}

}
