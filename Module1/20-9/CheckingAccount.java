
public class CheckingAccount 
{
	private int acn;
	private double balance;
	
	//constructor
	public CheckingAccount(int acn)
	{
		this.acn=acn;
	} 
	
	
	//getter-setter
	public int getAcn() 
	{
		return acn;
	}
	public void setAcn(int acn) 
	{
		this.acn = acn;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	
	//Deposit and withdrawal
	
	public void deposite(double amount) 
	{
		this.balance=amount;
	}
	
	public void withdral(double amount) throws InsufficintFundException 
	{
		if(amount<=balance) 
		{
			balance = balance - amount;
		}
		else 
		{
			double needs = amount-balance;
			throw new InsufficintFundException(needs);
		}
	}
	
}
