import java.util.Stack;

public class StackEx 
{
	static void push1(Stack st,Integer i)
	{
		st.push(i);
		
		System.out.println(i);
		System.out.println(st);
	
	}
	static void pop1(Stack st)
	{
		Integer i = (Integer) st.pop();
		
		System.out.println(i);
		System.out.println(st);
	}
	
	public static void main(String[] args) 
	{
		Stack st =new Stack();
		
		push1(st,10);
		push1(st,20);
		push1(st,30);
		push1(st,40);
		
		pop1(st);
		pop1(st);
		pop1(st);
		pop1(st);
	}
}
//LIFO-Last in First Out