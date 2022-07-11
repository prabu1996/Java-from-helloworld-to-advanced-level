//Let's see a simple example of List where we are using the ArrayList class as the implementation. 
import java.util.*;
class Test1
{
	public static void main(String arg[])
	{
		List<String> list=new ArrayList<String>();
		list.add("Violet");
		list.add("Green");
		list.forEach(a->{System.out.println(a);});
	}
}