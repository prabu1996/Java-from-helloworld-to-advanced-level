import java.util.*;
class DecToOct
{
	public DecToOct()
	{
		
	}
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter decimal number");
		int dec=t.nextInt();
		String oct="";
		for(int i=0;dec>0;i++)
		{
			int a=dec%8;
			oct=a+oct;
			dec/=8;
		}
		System.out.println("Equivalent octal number="+oct);	
	}
}