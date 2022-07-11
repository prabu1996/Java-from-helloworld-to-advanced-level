//Remove Elements Using LinkeHashSet Class
import java.util.*;
class Test3
{
	public static void main(String arg[])
	{
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Three");
		System.out.println("Before removing elements: "+set);
		set.remove("Three");
		System.out.println("After removing elements: ");
		for(String nums:set)
		{
			System.out.println(nums);
		}
	}
}