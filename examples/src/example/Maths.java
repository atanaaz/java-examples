package example;


public class Maths {
	
	
	public int division(int a, int b) throws Exception {	
		
		if(a<=0) {
			throw new ServiceException("Numerator Should be greater than 0",1000);
			
		} else if(b<=0) {
			throw new ServiceException("Denominator should be greater than 0",2000);
		}
		return a/b;
       
	}

}
