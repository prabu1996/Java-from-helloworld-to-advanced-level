import java.io.*;
class OctalToBinary
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter octal number");
			String o=t.readLine();
			int len,i,a,b;
			len=o.length();
			//System.out.println(len);
			i=0;
			a=10;
			b=0;
			while(i<len)
			{
				char c=o.charAt(i);
				if(c==48)
					b=(b*a);
				else if(c==49)
					b=(b*a)+1;
				else if(c==50)
					b=(b*a)+10;
				else if(c==51)
					b=(b*a)+11;
				else if(c==52)
					b=(b*a)+100;
				else if(c==53)
					b=(b*a)+101;
				else if(c==54)
					b=(b*a)+110;
				else if(c==55)
					b=(b*a)+111;
				a=a*10;
				i++;
				//System.out.println(b);
				//System.out.println(a);
			}
			System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}