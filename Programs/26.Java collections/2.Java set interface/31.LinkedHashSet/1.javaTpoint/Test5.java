//Java LinkedHashSet Example: Book
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
class Test5
{
	public static void main(String arg[])
	{
		LinkedHashSet<Book> set=new LinkedHashSet<Book>();
		Book t1=new Book(1,"Book1","Author1","Publisher1",05);
		Book t2=new Book(2,"Book2","Author2","Publisher2",10);
		Book t3=new Book(3,"Book3","Author3","Publisher3",15);
		
		set.add(t1);
		set.add(t2);
		set.add(t3);

		for(Book book:set)
		{
			System.out.println(book.id+" "+book.name);
		}
	}
}