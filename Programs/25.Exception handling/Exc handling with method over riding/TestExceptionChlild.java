// overriding the method in child class  
// gives compile time error  
//Rule 1: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.

import java.io.*;
class Parent
{
	public void msg()
	{
		System.out.println("Parent method");
	}	
}
class TestExceptionChlild extends Parent
{
	public void msg() throws IOException
	{
		System.out.println("TestExceptionChild");
	}
	public static void main(String arg[])
	{
		//Parent obj=new Parent();
		//TestExceptionChlild obj=new TestExceptionChlild();
		//TestExceptionChlild obj=new Parent(); important
		Parent obj=new TestExceptionChlild();
		obj.msg();	
	}
}