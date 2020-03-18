package example;

public class RectangleException extends Exception {

	int code;
	
	public RectangleException(String Message, int code) {
		super(Message);
		this.code=code;
	}
	public RectangleException(String Message, int code,int ext) {
		super(Message);
		this.code=code;
	}
	public int getCode() {
		return this.code;
	}
	
	
}
