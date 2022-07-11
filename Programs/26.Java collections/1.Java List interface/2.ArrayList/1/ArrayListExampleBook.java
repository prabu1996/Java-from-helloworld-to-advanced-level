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
class ArrayListExampleBook
{
	public static void main(String arg[])
	{
		ArrayList<Book> list=new ArrayList<Book>();
		Book t1=new Book(01,"book1","autho1","pub1",5);
		Book t2=new Book(02,"book2","author2","pub2",10);
		Book t3=new Book(03,"book3","author3","pub3",15);
		list.add(t1);
		list.add(t2);
		list.add(t3);
		//System.out.println(list);
		list.forEach(a->{System.out.println(a.id+" "+a.name+" "+a.author+" "+a.publisher+" "+a.quantity);});
	}
}