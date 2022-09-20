import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		
		Vector v = new Vector<>(5);
		
		v.add("Android");
		v.add("Java");
		v.add("Android");
		v.add("Java");
		v.add("Java");
		v.add("Java");
		v.add("Java");
		v.add("Android");
		v.add("Java");
		v.add("Java");
		v.add("Java");
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		if(v.contains("android"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
			
	}
}
