import java.io.*;
class TestSwitch
{
	public static void main(String arg[])
	{
	   try
	   {
		DataInputStream t=new DataInputStream(System.in);
		int a,b,c;
		System.out.println("enter a");
		a=Integer.parseInt(t.readLine());
		System.out.println("enter b");
		b=Integer.parseInt(t.readLine());
		System.out.println("enter codeword");
		c=Integer.parseInt(t.readLine());
		switch(c)
		{
			case 1:	System.out.println("addition="+(a+b));
				break;
			case 2: 	System.out.println("sub="+(a-b));
				break;
			case 3:	System.out.println("mult="+(a*b));
				break;
			case 4:	System.out.println("divi"+(a/b));
				break;
			case 5:	System.out.println("rem ="+(a%b));
				break;
			default :	System.out.println("check your code");	
		}
			
	       }
	    catch (Exception e)
	    {
	       System.out.println(e);
	    }
	}
}