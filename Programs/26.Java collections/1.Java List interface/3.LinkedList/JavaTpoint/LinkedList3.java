import java.util.*;
class LinkedList3
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Black");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Orange");
		list.add("Brown");
		list.forEach(a->{System.out.println(a);});
		System.out.println("");
		list.remove("Red");
		list.forEach(a->{System.out.println(a);});
		list.remove(0);
		System.out.println("");
		list.forEach(a->{System.out.println(a);});
		list.removeFirst();
		list.removeLast();
		System.out.println("");

		list.forEach(a->{System.out.println(a);});
		//list.removeFirstOccurrence("Orange");
		list.removeLastOccurrence("Orange");
		System.out.println("");
		list.forEach(a->{System.out.println(a);});
	}
}