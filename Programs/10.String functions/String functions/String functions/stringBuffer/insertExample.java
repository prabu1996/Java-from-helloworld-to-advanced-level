import java.io.*;
class insertExample
{
	public static void main(String arg[])
	{
		StringBuffer t=new StringBuffer("GeeksGeeks");
		System.out.println(t.insert(5,"for"));
		System.out.println(t.insert(0,5 ));
		System.out.println(t.insert(3,"true"));
		System.out.println(t.insert(5,41.35));
		System.out.println(t.insert(8,41.35));
		System.out.println(t.insert(2,"pawan"));
		
	}
}