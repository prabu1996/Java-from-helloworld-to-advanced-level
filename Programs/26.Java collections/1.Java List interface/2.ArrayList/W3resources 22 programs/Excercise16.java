import java.util.*;
class Excercise16
{
	public static void main(String arg[])
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		System.out.println("list1: "+list1);
		ArrayList<String> list2=(ArrayList<String>)list1.clone();
		System.out.println("clone of list1 is list2: "+list2);
	}
}