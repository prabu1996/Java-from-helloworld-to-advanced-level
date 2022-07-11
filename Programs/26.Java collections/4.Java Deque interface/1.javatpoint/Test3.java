//Java ArrayDeque Example: Book
import java.util.*;
class Book
{
	int id,quantity;
	String name,author,publisher;
	public Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
class Test3
{
	public static void main(String arg[])
	{
		Deque<Book> deque=new ArrayDeque<Book>();
		Book t1=new Book(01,"Book1","Author1","Publisher1",05);
		Book t2=new Book(02,"Book2","Author2","Publisher2",15);
		Book t3=new Book(03,"Book3","Author3","Publisher3",25);
		deque.offer(t1);
		deque.offer(t2);
		deque.offer(t3);
		for(Book b:deque)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}