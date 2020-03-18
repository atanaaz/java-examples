package example;

public class ServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int code;
	
	public ServiceException(String message,int code) {		
		super(message);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}

}
