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
class  LinkedList5Book
{
	public static void main(String arg[])
	{
		List<Book> list=new LinkedList<Book>(); //Inteface List can't be instanticed
		Book t1=new Book(1,"Book1","Author1","Publisher1",05); 	
		Book t2=new Book(2,"Book2","Author2","Publisher2",10);	
		Book t3=new Book(3,"Book3","Author3","Publisher3",15);
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.forEach(a->{System.out.println(a.id+" "+a.name+" "+a.author+" "+a.publisher+" "+a.quantity);});
	}
}