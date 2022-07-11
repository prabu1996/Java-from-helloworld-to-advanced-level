//LinkedListExample
import java.util.*;
class Book implements Comparable<Book>
{
	int id,quantity;
	String name,author,publication;
	public Book(int id,String name,String author,String publication,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publication=publication;
		this.quantity=quantity;
	}
}
class Test2
{
	public static void main(String arg[])
	{
		Queue<Book> name=new PriorityQueue<Book>();
		Book t1=new Book(01,"Book1","Author1","Pub1",05);
		Book t2=new Book(02,"Book2","Author2","Pub2",10);
		Book t3=new Book(03,"Book3","Author3","Pub3",15);
		name.add(t1);
		name.add(t2);
		name.add(t3);
		for(Book element:name)
		{
			System.out.println(element.id+" "+element.name+" "+element.author+" "+element.publication+" "+element.quantity);
		}
	}
}