// Let's see an example of List where we are adding the Books.
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
class Test7
{
	public static void main(String arg[])
	{
		List<Book> list=new ArrayList<Book>();
		Book obj1=new Book(01,"Book1","Author1","Publisher1",05);
		Book obj2=new Book(02,"Book2","Author2","Publisher2",10);
		Book obj3=new Book(03,"Book3","Author3","Publisher3",15);
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		for(Book note:list)
		{
			System.out.println(note.id+","+note.name+","+note.author+","+note.publisher+","+note.quantity);
		}
	}
}