//Java LinkedHashSet example ignoring duplicate Elements
import java.util.*;
class Test2
{
	public static void main(String arg[])
	{
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Three");
		for(String nums:set)
		{
			System.out.println(nums);
		}
	}
}