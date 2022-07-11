import java.io.DataInputStream;
class IfRevBig3
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int a,b,c;
			System.out.println("enetr a");
			a=Integer.parseInt(t.readLine());
			System.out.println("enetr b");
			b=Integer.parseInt(t.readLine());
			System.out.println("enter c");
			c=Integer.parseInt(t.readLine());
			if (a>b && a>c)
			  System.out.println("a is biggest");
			if (b>c && b>a)
			  System.out.println("b is biggest");
			if (c>a && c>b)
			  System.out.println("c is biggest");
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}