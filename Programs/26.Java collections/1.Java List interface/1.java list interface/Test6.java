// Java ListIterator interface
import java.util.*;
class Test6
{
	public static void main(String arg[])
	{
		List<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Jack");
		list.add("Banana");
		ListIterator<String> itr=list.listIterator();
		System.out.println("Printing elements in forward direction");
		while(itr.hasNext())
		{
			System.out.println("Index: "+itr.nextIndex()+" Value: "+itr.next());	
		}
		System.out.println("Printing elements in backward direction");
		while(itr.hasPrevious())
		{
			System.out.println("Index: "+itr.previousIndex()+" Value: "+itr.previous());
		}
	}
}