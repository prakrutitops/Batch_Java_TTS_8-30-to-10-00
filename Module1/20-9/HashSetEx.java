import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx 
{
	public static void main(String[] args)
	{
		
		HashSet list = new HashSet();
		
		list.add("Android");
		list.add("Java");
		list.add("Php");
		list.add("Ios");
		
		ArrayList list2 = new ArrayList<>();
		
		list2.add("Flutter");
		list2.add("React");
		list2.add("Java");
		
		list.addAll(list2);
		
		/*list.addAll(list2);
		
		list.remove(1);
		list.removeAll(list2);		
		*/
		//list.retainAll(list2);
		
		System.out.println(list);
		
		Iterator i =list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}
