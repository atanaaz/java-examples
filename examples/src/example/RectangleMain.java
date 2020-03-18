package example;

public class RectangleMain {

	public static void main(String[] args) {
	
		Rectangle r=new Rectangle();
		try {
		System.out.println("Area:"+ r.calculateArea(-1,-1));
		}catch(RectangleException re) {
			System.out.println(re.getCode()+":"+ re.getMessage());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
		

	}
	
	
	public void method() {
		System.out.print("Arshi");
	}
	
	
	public void method1() {
		method();
		System.out.print("luckman");
	}
	
	

}
