import java.io.*;
class TestSwitch2
{
	public static void main(String arg[])
	{
	   try
	   {
		DataInputStream t=new DataInputStream(System.in);
		String a;
		char b;
		System.out.println("enter a");
		a=t.readLine();
		b=a.charAt(0);
		switch (b)
		
		{
			case 'a':
			case'A':	
			case 'e':
			case'E':	
			case 'i':
			case'I':	
			case 'o':
			case'O':
			case'u':	
			case 'U':	System.out.println(b+"  is vowel");
				break;
			default :	System.out.println(b+"  is consonant");	
		}
			
	       }
	    catch (Exception e)
	    {
	       System.out.println(e);
	    }
	}
}