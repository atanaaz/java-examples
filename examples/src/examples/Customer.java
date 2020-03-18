package examples;

public class Customer {
	
 public String getName() {
		return name;
	}

	public void setName(String name) {
		if(!name.contains("123456")) {
		this.name = name;
		}
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

 private String name;
	
 private String order;

}
