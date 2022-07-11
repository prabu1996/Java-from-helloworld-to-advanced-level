import java.io.*;
class Reverse1
{
	public static void main(String arg[])
	{
		
			int a=1245;
			String c="rev is";
			int b=a%10;
			c+=String.valueOf(b);
			a=a/10;
			System.out.println(c);
			
	}
}		
