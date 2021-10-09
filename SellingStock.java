
public class SellingStock implements State{
	
	FlySwatter fly;
	public SellingStock(FlySwatter fly)
	{
		this.fly=fly;
	}
	
	public void hasStock() 
	{
		System.out.println("FlySwatters are in Stock");
	}
	public void hasElectricStock() 
	{
		System.out.println("Electric FlySwatters are in Stock");
		
	}
	public void sellStock() 
	{
		System.out.println("FlySwatters are selling now ... ");
		fly.setState(fly.getBuyStock());
	}
	
	public void buyStock() 
	{
		System.out.println("Inventory is full ");
	}
	public void buyElectricStock() 
	{
		System.out.println("Inventory is full ");
	}
	
	public String toString() 
	{
		return "=== Sell Stock  State === ";
	}

}
