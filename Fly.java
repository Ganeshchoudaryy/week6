
public class Fly {
	
	private String type;
	private String price;
	
	public Fly(String type, String price) {
		super();
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return " \n Type is " + type + " \n Price is " + price + " \n";
	}

}
