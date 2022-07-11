//Java HashSet from another Collection
import java.util.*;
class Test4
{
	public static void main(String arg[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");

		HashSet<String> set=new HashSet<String>(list);  //Arraylist also one opf the collection type.so only we can pass arraylist as a arg in hashset collection.
		set.add("Four");
		Iterator obj=set.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
	}
}