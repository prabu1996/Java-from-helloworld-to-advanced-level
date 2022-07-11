//Java ArrayDeque Example: offerFirst() and pollLast()
import java.util.*;
class Test2
{
	public static void main(String arg[])
	{
		Deque<String> deque=new ArrayDeque<String>();

		//To add elements differnt methods
		deque.add("Mani");
		deque.add("Somu");
		deque.add("Mari");
		System.out.println(deque);
		deque.offer("poori");
		System.out.println(deque);
		deque.offerFirst("Theertham");
		System.out.println(deque);

		//To remove using differnt methods
		deque.remove("Mani");
		System.out.println(deque);
		deque.poll();
		deque.pollFirst(); // same like poll()
		System.out.println(deque);
		deque.pollLast();
		System.out.println(deque);
		//deque.clear();
		deque.removeAll(deque);
		System.out.println(deque);
	}
}