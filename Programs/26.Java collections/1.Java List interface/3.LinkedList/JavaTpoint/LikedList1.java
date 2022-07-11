import java.util.*;
class LikedList1
{
                
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.forEach(a->{System.out.println(a);});	
	}
}