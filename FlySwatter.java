
public class FlySwatter {
	
	State hasstock;
	State buystock;
	State sellingstock;
	State haselectricstock;
	State buyelectricstock;
	
	State state;
	
	public FlySwatter ()
	{
		hasstock= new HasStock(this);
		buystock= new BuyStock(this);
		sellingstock = new SellingStock(this);
		haselectricstock = new HasElectricStock(this);
		buyelectricstock = new BuyElectricStock(this);
		
		state = hasstock;
		
	}
	
	public void hasStock()
	{
		state.hasStock();
	}
	
	public void sellStock()
	{
		state.sellStock();
	}
	
	public void hasElectricStock()
	{
		state.hasElectricStock();
	}
	
	
	public void buyStock()
	{
		
		state.buyStock();
	}
	
	public void buyElectricStock()
	{
		
		state.buyElectricStock();
	}
	
	
	void setState(State state) 
	{
		this.state = state;
	}
	public State getState() 
	{
        return state;
    }

    public State getHasStock() 
    {
        return hasstock;
    }
    public State getHasElectricStock() 
    {
        return haselectricstock;
    }

    public State getSellStock() 
    {
        return sellingstock;
    }
    public State getBuyStock() 
    {
        return buystock;
    }
    public State getBuyElectricStock() 
    {
        return buyelectricstock;
    }
    
    
    public String toString() 
    {
		StringBuffer result = new StringBuffer();
		result.append("\nElectrical Fly Swatter Shop");
		result.append("\nJava-enabled FlySwatter");
		
		result.append("\n");
		result.append("FlySwatter is in " + state + "\n");
		return result.toString();
	}
	

}
