import java.util.*;
class ArrayList6
{
	public static void main(String arg[])
	{
		ArrayList<String> list=new ArrayList<String> ();
		list.add("Apple");
		list.add("Orange");
		list.add("Guava");
		list.add("Mango");
		System.out.println("Traversing list through forEach() method:");  
		list.forEach(a->{System.out.println(a);});
	}
}