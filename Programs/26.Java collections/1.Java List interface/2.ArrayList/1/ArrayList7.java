import java.util.*;
class ArrayList7
{
	public static void main(String arg[])
	{
		ArrayList<String> list=new ArrayList<String> ();
		list.add("Apple");
		list.add("Orange");
		list.add("Guava");
		list.add("Mango");
		System.out.println("Traversing list through forEachRemaining() method:");  
		Iterator<String> itr=list.iterator();
		itr.forEachRemaining(a->{System.out.println(a);});
	}
}