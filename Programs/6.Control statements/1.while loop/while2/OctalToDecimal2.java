import java.io.*;
class OctalToDecimal2
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("octal number");
			int num=Integer.parseInt(t.readLine());
			String x=String.valueOf(num);
			int len=x.length();
			int rev=0;
			int i=10;
			int j=1;
			while(num>0)
			{
				int rem=num%10;
				rev=(rev*i)+rem;
				num=num/10;	
			}
			System.out.println(rev);
			int n=rev;
			int dec=n%10;
			//System.out.println(dec);
			while(j<len)
			{
				n=n/10;
				int rem1=n%10;
				dec=dec*8+rem1;
				//System.out.println(dec);
				j++;
			}
			System.out.println(dec);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}