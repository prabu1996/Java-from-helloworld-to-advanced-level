//Java PriorityQueue Example
import java.util.*;
class Test1
{
	public static void main(String arg[])
	{
		PriorityQueue<String> name=new PriorityQueue<String>();
		name.add("Prabu");
		name.add("Ajith");
		name.add("Rohit");
		name.add("Prabhu");
		System.out.println(name.element());
		System.out.println(name.peek());
		Iterator obj=name.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
		name.remove();
		name.poll();
		System.out.println(name);
	}
}