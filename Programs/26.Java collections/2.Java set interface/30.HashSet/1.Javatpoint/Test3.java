//Java HashSet example to remove elements
//In this example, Here, we see different ways to remove an element.
import java.util.*;
class Test3
{
	public static void main(String arg[])
	{
		HashSet<String> nums=new HashSet<String>();
		nums.add("One");
		nums.add("Two");
		nums.add("Three");
		nums.add("Four");
		nums.add("One");
		//To remove  element by its element name
		nums.remove("Two");
		nums.remove("One");
		System.out.println(nums);
		
		
		HashSet<String> set=new HashSet<String>();
		set.add("Apple");
		set.add("Orange");
		set.add("Guava");
		//add set1 and set2
		nums.addAll(set);
		System.out.println(nums);

		//To remove set2 from set1
		nums.removeAll(set);
		System.out.println(nums);

		//Index number vachi elements remove panna mudiyaadhu becoz hashsets are shuffle by nature

		 //Removing elements on the basis of specified condition  
		nums.removeIf(a->a.contains("Four"));
		System.out.println(nums);
		
		//To remove all the elemenets from a hashset
		nums.clear();
		System.out.println(nums);
	}
}