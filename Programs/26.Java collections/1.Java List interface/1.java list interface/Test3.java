//Let's see a simple example to convert list elements into array.
import java.util.*;
class Test3
{
	public static void main(String arg[])
	{
		List<String> list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		String[] array=list.toArray(new String[list.size()]);
		System.out.println("list: "+list);
		System.out.println("Array: "+Arrays.toString(array));
	}
}