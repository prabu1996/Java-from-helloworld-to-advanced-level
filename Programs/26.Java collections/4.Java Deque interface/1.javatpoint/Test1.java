//ArrayDequeExample.java
import java.util.*;
class Test1
{
	public static void main(String arg[])
	{
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("One");
		deque.add("Two");
		deque.add("Three");
		deque.forEach(a->{System.out.println(a);});
	}
}