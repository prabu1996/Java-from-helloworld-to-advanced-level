import java.util.*;
class ArrayListExample4
{
	public static void main(String arg[])
	{
		ArrayList<String> list=new ArrayList<String> ();
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		list.add("Guava");
		System.out.println(list.get(1));
		System.out.println(list.get(0));
		list.set(0,"dates");
		for(String fruits:list)
		{
			System.out.println(fruits);
		}
	}
}