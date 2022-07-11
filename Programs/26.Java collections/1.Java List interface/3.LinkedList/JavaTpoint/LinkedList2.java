import java.util.*;
class LinkedList2
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Red");
		list.add("Orange");
		list.add("Black");
		//list.forEach(a->{System.out.println(a);});
		list.add(0,"White");
		//list.forEach(a->{System.out.println(a);});
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("Pink");
		list2.add("Grey");
		list.addAll(list2);
		//list.forEach(a->{System.out.println(a);});
		list.addFirst("Yellow");
		list.addLast("Blue");	
		list.forEach(a->{System.out.println(a);});	
	}
}