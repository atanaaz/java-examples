package examples;

import java.util.*;

public class Decend {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(7);
		l.add(2);
		l.add(16);
		l.add(10);
		System.out.println("--->" + l);
		//int[] a = new int[l.size()];

		
		Comparator<Integer> c= (a,b)-> (a<b)?1:((a>b)? -1:0);
		Collections.sort(l, c);
		
		System.out.println(">>"+l );
	
   
		
		
		
		/*
		l.sort((c,b)->c>b?-1:0);
	 
		  System.out.println("Compsrtor" +l);
		 
	
	
	  l.sort(new Comparator(){
		  public int compare(Object a,Object b) { 
			  int a1 =(int)a; 
			  int b1 = (int)b;
			  return a1<b1?0:-1; }});
	  
	  System.out.println("Compsrtor" +l); 
	  List<Integer> r= new ArrayList();
	  
	  for(int k =0; k<a.length; k++) { a[k] = l.get(k); }
	  
	  for(int i=0; i<l.size(); i++) { 
		  for(int j=i+1; j<l.size(); j++) { 
			  if(a[i] < a[j]) { 
				  int temp=a[j]; a[j]=a[i];
				  a[i] = temp;
	  
	  } } } System.out.println("--->"+Arrays.toString(a));
	  //System.out.println("--->"+r);
	  
	  
	  for(int g=0; g<a.length;g++) { r.add(a[g]); }
	  
	 System.out.println(r);
	  */
	  }
	 

}
