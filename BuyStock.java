
public class BuyStock implements State{

	FlySwatter fly;
	public BuyStock(FlySwatter fly)
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
		
	}
	
	public void buyStock() 
	{
		System.out.println("Inventory is not full now ");
		fly.setState(fly.getBuyElectricStock());
	}
	public void buyElectricStock() 
	{
		System.out.println("Inventory is full ");
	}
	
	public String toString() 
	{
		return "=== Buy Stock  State === ";
	}
}
