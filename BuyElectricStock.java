
public class BuyElectricStock implements State{
	
	FlySwatter fly;
	public BuyElectricStock(FlySwatter fly)
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
	}
	public void buyElectricStock() 
	{
		System.out.println("Inventory is not full, about to empty ");
	}
	
	public String toString() 
	{
		return "=== Buy Electric Stock  State === ";
	}
}
