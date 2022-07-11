//Let's see a simple example of the Java LinkedHashSet class. Here you can notice that the elements iterate in insertion order.

import java.util.*;
class Test1
{
	public static void main(String arg[])
	{
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		for(String nums:set)
		{
			System.out.println(nums);
		}
	}
}