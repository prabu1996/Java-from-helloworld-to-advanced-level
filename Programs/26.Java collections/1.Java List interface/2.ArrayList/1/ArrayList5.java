import java.util.*;
class ArrayList5
{
	public static void main(String arg[])
	{
		ArrayList<String> list=new ArrayList<String> ();
		list.add("Apple");
		list.add("Orange");
		list.add("Guava");
		list.add("Mango");
		System.out.println("Traversing list through forloop:");  
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}