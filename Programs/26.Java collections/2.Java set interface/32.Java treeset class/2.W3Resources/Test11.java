//Write a Java program to get the element in a tree set which is less than or equal to the given element.
import java.util.*;
class Test11
{
	public static void main(String arg[])
	{
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(1);
		set.add(82);
		set.add(35);
		set.add(24);
		set.add(505);
		set.add(60);
		set.add(07);
		set.add(88);
		set.add(19);
		set.add(110);
		System.out.println("set: "+set);
		System.out.println("Less than or equal to 86 : "+set.floor(86));
		System.out.println("Less than or equal to 110 "+set.floor(110));
	}
}