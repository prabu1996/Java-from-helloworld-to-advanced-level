import java.util.*;
class BinToDec
{
	public BinToDec()
	{
	}
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		int dec=0;
		System.out.println("ENter binary value");
		String a=t.next();
		int n=a.length();
		for(int i=0;i<n;i++)
		{
			int b=a.charAt(i);
			if(b==49)
			{
				dec=dec*2+1;
			}
			else
				dec=dec*2+0;
		}
		System.out.println("Equivalent dec value="+dec);
	}
}

