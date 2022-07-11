//Let's see a simple example of Java TreeSet.
import java.util.*;
class Test1
{
	public static void main(String arg[])
	{
		TreeSet<String> t_set=new TreeSet<String>();
		t_set.add("one");
		t_set.add("two");
		t_set.add("three");
		System.out.println(t_set);
	}
}