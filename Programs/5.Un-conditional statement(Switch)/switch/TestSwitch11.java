import java.io.*;
class TestSwitch11
{
  public static void main(String arg[])
  {
    try
    {
	DataInputStream t=new DataInputStream(System.in);
	int a,b;
	String c;
	char d;
	System.out.println("enter a");
	a=Integer.parseInt(t.readLine());
	System.out.println("enter b");
	b=Integer.parseInt(t.readLine());
	System.out.println("enter logic code");
	c=t.readLine();
	d=c.charAt(0);
	switch (d)
	{
		case '+' :	System.out.println("addition is"+(a+b));
			break;
		case '-' :    System.out.println("subs is"+(a-b));
			break;
		case '*' :	System.out.println("mul is"+(a*b));
			break;
		case '/'  :	System.out.println("div is"+(a/b));
			break;
		case '%' :	System.out.println("rem is "+(a%b));
			break; 
		default :	System.out.println("check your input");
			
	}
	
    }
     catch (Exception e)
     {
       System.out.println(e);
     }	
  }
}