
public class BankDemo 
{
	public static void main(String[] args) 
	{
		
		BankDemo b =new BankDemo();
		CheckingAccount c =new CheckingAccount(101);
		
		
		c.deposite(10000);
		
		try 
		{
			c.withdral(5000);
			System.out.println("Your balance is = "+c.getBalance());
		} 
		catch (InsufficintFundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("You have no sufficient balance, You need more  "+e.getAmount());
			System.out.println("Your balance is = "+c.getBalance());
		}
		
	}
}
