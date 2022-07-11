import java.io.*;
class OctalToBinary1
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter octal number");
			String o=t.readLine();
			int len,i;
			len=o.length();
			//System.out.println(len);
			i=0;
			String b="";
			while(i<len)
			{
				char c=o.charAt(i);
				if(c==48)
					b+="000";
				else if(c==49)
					b+="001";
				else if(c==50)
					b+="010";
				else if(c==51)
					b+="011";
				else if(c==52)
					b+="100";
				else if(c==53)
					b+="101";
				else if(c==54)
					b+="110";
				else if(c==55)
					b+="111";
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