//Java HashSet Example
//Notice, the elements iterate in an unordered collection.
import java.util.*;
class Test1
{
	public static void main(String arg[])
	{
		HashSet<String> nums=new HashSet<String>();
		nums.add("One");
		nums.add("Two");
		nums.add("Three");
		nums.add("Four");
		nums.add("Five");
		Iterator obj=nums.iterator(); // To print followed by to iterate
		while(obj.hasNext())         
		{
			System.out.println(obj.next()); 
		}
		
	}
}