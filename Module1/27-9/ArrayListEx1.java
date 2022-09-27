import java.util.ArrayList;

public class ArrayListEx1 
{
	public static void main(String[] args) 
	{
		
		ArrayList al = new ArrayList<>();
		al.add("TOPS");
		al.add('H');
		al.add(null);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(null);
		System.out.println(al);
		
		al.add(3, "INDIA");
		System.out.println(al);
		
		System.out.println(al.get(3));
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains("INDIA"));
		al.remove(null);
		System.out.println(al);
		
		
		ArrayList al2 = new ArrayList<>();
		al2.add("TOPS");
		al2.addAll(al);
		System.out.println(al2);
		al2.clone();
		System.out.println(al2.clone());
		al2.clear();
		System.out.println(al2);
		System.out.println(al.subList(2,5));;
		
		ArrayList al3 = new ArrayList<>(50);
		al3.add("a");
		System.out.println(al3.size());
		/*al2.clone();
		System.out.println(al2.clone());
		al2.clear();
		System.out.println(al2);
		
		System.out.println(al.subList(2, 5));;
		
		ArrayList all = new ArrayList<>(al);
		System.out.println(all);
		
		ArrayList al3 = new ArrayList<>(50);
		System.out.println(al3.size());
		*/
		
		
	}
}
