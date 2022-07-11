import java.util.*;
class Test1
{
	public static void main(String arg[])
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Anuth");
		list1.add("Gokhul");
		list1.add("Jp");
		System.out.println(list1.size());
		ArrayList<String> list2=new ArrayList<String>(10); //capacity
		System.out.println(list2.size()); //still the output is zero,becoz we dont have any methods to find capacity
	}
}