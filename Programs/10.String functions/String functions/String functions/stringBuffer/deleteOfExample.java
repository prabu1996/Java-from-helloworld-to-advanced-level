import java.io.*;
class deleteOfExample
{
	public static void main(String arg[])
	{
		StringBuffer t=new StringBuffer("GeeksforGeeks");
		System.out.println(t.deleteCharAt(4));
		System.out.println(t.delete(4,7));
	}
}