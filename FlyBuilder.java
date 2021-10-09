
public class FlyBuilder {
	
	private String type;
	private String price;

	
	
	public FlyBuilder setType(String type) {
		this.type = type;
		return this;
	}
	public FlyBuilder setPrice(String price) {
		this.price = price;
		return this;
	}
	
	
	public Fly getFly() {
		return new Fly(type, price);
	}

}
