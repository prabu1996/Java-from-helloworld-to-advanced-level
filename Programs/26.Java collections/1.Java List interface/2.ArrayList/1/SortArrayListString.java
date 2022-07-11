import java.util.*;
class SortArrayListString
{
	public static void main(String arg[])
	{
		ArrayList<String> list=new ArrayList<String> ();
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		list.add("Guava");
		Collections.sort(list);
		for(String fruits:list)
		{
			System.out.println(fruits);
		}
		
	
	}
}