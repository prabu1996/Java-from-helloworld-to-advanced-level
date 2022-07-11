//Let's see an example to retrieve and remove the highest and lowest Value.
import java.util.*;
class Test3
{
	public static void main(String arg[])
	{
		TreeSet<Integer> t_set=new TreeSet<Integer>();
		t_set.add(150);
		t_set.add(10);
		t_set.add(36);
		System.out.println(t_set.pollFirst());
		System.out.println(t_set.pollLast());
	}
}