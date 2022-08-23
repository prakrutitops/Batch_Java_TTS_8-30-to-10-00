
public class VoteEx 
{
	public static void main(String[] args) 
	{
		
		int age=15;
		
		if(age>18)
		{
			
			System.out.println("Eligible to vote");
			if(age>60)
			{
				System.out.println("Senior Citizen");
			}
			else
			{
				System.out.println("Young Person");
			}
			
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
		
	}
}
