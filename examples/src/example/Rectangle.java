package example;

public class Rectangle {

	
	
	public double calculateArea(double l, double b) throws Exception {
	
			if(l==0){
			throw new RectangleException("The length of a rectangle cannot be zero", 1000);
		}else if(b==0) {
			throw new RectangleException("The breadth of a rectangle cannot be zero", 2000);
		} else if(l<0){
			throw new RectangleException("The length of a rectangle cannot be negative", 3000);
		} else if (b<0){
			throw new RectangleException("The breadth of a rectangle cannot be negative", 4000);
		}
			return l*b;
		
	
	}
	
}
