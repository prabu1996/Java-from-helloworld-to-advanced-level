import java.io.*;
class OctalToBinary
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int dec,len,i,bin,j;
			System.out.println("input octal number");
			n=t.readLine();
			len=n.length();
			dec=0;
			j=1;
			bin=0;
			for(i=0;i<len;i++)
			{
				dec=dec*8+Character.getNumericValue(n.charAt(i));
				
			}
			//System.out.println(dec);
			for(;dec>0;)
			{
				bin=(dec%2)*j+bin;
				j=j*10;
				dec=dec/2;	
			}
			System.out.println(bin);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
