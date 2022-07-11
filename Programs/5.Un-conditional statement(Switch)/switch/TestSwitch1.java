import java.io.*;
class TestSwitch1
{
	public static void main(String arg[])
	{
	   try
	   {
		DataInputStream t=new DataInputStream(System.in);
		int a,b;
		String c; 
		System.out.println("enter a");
		a=Integer.parseInt(t.readLine());
		System.out.println("enter b");
		b=Integer.parseInt(t.readLine());
		System.out.println("enter codeword");
		c=t.readLine();
		char d;
		d=c.charAt(0);
		switch(d)
		{
			case '+':	System.out.println("addition="+(a+b));
				break;
			case '-': 	System.out.println("sub="+(a-b));
				break;
			case '*':	System.out.println("mult="+(a*b));
				break;
			case '/':	System.out.println("divi"+(a/b));
				break;
			case '%':	System.out.println("rem ="+(a%b));
				break;
			
		}
			
	       }
	    catch (Exception e)
	    {
	       System.out.println(e);
	    }
	}
}