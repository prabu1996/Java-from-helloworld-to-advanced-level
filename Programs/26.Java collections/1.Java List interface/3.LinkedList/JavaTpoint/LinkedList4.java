//Java LinkedList Example to reverse a list of elements
import java.util.*;
class LinkedList4
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
		Iterator i=list.descendingIterator();  
           	while(i.hasNext())  
           	{  
              		 System.out.println(i.next());  
		}
	}
}