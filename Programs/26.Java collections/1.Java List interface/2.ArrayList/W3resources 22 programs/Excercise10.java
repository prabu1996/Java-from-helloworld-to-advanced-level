import java.util.*;
class Excercise10
{
	public static void main(String arg[])
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("A");
		list1.add("B");
		list1.add("C");
		System.out.println("Before: "+list1);
		Collections.shuffle(list1);
		System.out.println("After: "+list1);
		
	}
}