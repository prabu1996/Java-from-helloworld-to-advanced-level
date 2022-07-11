//Get and Set Element in List
import java.util.*;
class Test4
{
	public static void main(String arg[])
	{
		List<String> list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		System.out.println(list.get(0));
		list.set(0,"Zero");
		Iterator obj=list.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
	}
}