//Let's see an example of traversing elements in descending order.
import java.util.*;
class Test2
{
	public static void main(String arg[])
	{
		TreeSet<String> t_set=new TreeSet<String>();
		t_set.add("one");
		t_set.add("two");
		t_set.add("three");
		Iterator obj=t_set.descendingIterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
	}
}