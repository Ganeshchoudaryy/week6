
public class TestProgram {
	
	
	public static void main(String[] args) 
	{
		
		
		Fly Normal = new FlyBuilder().setType("Normal").setPrice("$15").getFly();
		Fly Electric = new FlyBuilder().setType("Electric").setPrice("$40").getFly();
		
		
		System.out.println("Normal FLy Swatter Details are :  "+  Normal);
		System.out.println("Eectric FLy Swatter Details are :  "+  Electric);
		
		
		FlySwatter fly = new FlySwatter();
		 System.out.println(fly);
		 
		 fly.hasStock();
		 System.out.println(fly);
		 fly.hasElectricStock();
		 System.out.println(fly);
		 fly.sellStock();
		 System.out.println(fly);
		 fly.buyStock();
		 System.out.println(fly);
		 fly.buyElectricStock();
		 
		 
		 

	}
	
	

}
