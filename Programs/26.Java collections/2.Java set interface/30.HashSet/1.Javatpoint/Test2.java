//Java HashSet example ignoring duplicate elements
//In this example, we see that HashSet doesn't allow duplicate elements.
import java.util.*;
class Test2
{
	public static void main(String arg[])
	{
		HashSet<String> nums=new HashSet<String>();
		nums.add("One");
		nums.add("Two");
		nums.add("Three");
		nums.add("Four");
		nums.add("One");
		Iterator obj=nums.iterator(); // To print followed by to iterate
		while(obj.hasNext())         
		{
			System.out.println(obj.next()); 
		}
		
	}
}