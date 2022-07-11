imort java.io.*;
class TestSwitch3
{
	public static void main(String arg[])
	{
	  try
	  {
	 	DataInputStream t=new DataInputStream(System.in);
		int a,b,c ;
		System.out.println("enter a");
		a=Integer.parseInt(t.readLine());
		System.out.println("enter b");
		b=Integer.parseInt(t.readLine());
		System.out.println("code");
		c=Integer.parseInt(t.readLine());
		Switch (c)
		{
			case 1:	d=(a+b);
				System.out.println("sum is"+d);
				break;
			case 2:	d=(a-b);
				System.out.println("subt is"+d);
			case 3:	d=(a*b);
				System.out.println("mult is"+d);
			case 4:	d=(a/b);
				System.out.println("div is"+d);
			case 5:	d=(a%b);
				System.out.println("rem is"+d);
			default	System.out.println("check your code");
		}				
	  }
	  catch (Exception e)
	  {
	     Sytem.out.println(e);
	  }
	}
}