//Write a Java program to convert a hash set to an array.
import java.util.*;
class Test6
{
	public static void main(String arg[])
	{
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		
		String[] nums=new String[set.size()];
		set.toArray(nums);    
		
		for(String output:nums)   //to print array elemets we used for loop
		{
			System.out.println(output);
		}
	}
}