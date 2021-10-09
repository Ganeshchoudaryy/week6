
public class HasElectricStock implements State{
	
	FlySwatter fly;
	public HasElectricStock(FlySwatter fly)
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
		fly.setState(fly.getSellStock());
	}
	public void sellStock() 
	{
		System.out.println("FlySwatters are not selling yet ... ");
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
		return "=== Has Electric Stock  State === ";
	}
}
