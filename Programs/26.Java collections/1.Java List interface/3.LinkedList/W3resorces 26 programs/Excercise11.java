// Write a Java program to display the elements and their positions in a linked list
import java.util.*;
class Excercise11
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Four");		
		list.add(2,"Three");
		list.add(0,"Zero");
		int size=list.size();
		System.out.println("Size of the list:"+size);
		for(int i=0;i<size;i++)
		{
			System.out.println("Postion: "+i+" Element: "+list.get(i));
		}
	}
}