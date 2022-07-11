import java.util.*;
class ArrayList4
{
	public static void main(String arg[])
	{
		ArrayList<String> list=new ArrayList<String> ();
		list.add("Apple");
		list.add("Orange");
		list.add("Guava");
		list.add("Mango");
		System.out.println("Traversing list through List Iterator:");  
		ListIterator<String> list1=list.listIterator(list.size());
		while(list1.hasPrevious())
		{
			String str=list1.previous();
			System.out.println(str);
		}
	}
}