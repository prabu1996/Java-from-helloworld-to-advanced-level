import java.util.Scanner;
class DecToHex
{
	public DecToHex()
	{
	}
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter decimal number");
		int dec=t.nextInt();
		String hex="";
		for(int i=0;dec>0;i++)
		{
			int a=dec%16;
			if(a==10)
				hex="A"+hex;
			else if(a==11)
				hex="B"+hex;
			else if(a==12)
				hex="C"+hex;
			else if(a==13)
				hex="D"+hex;
			else if(a==14)
				hex="E"+hex;
			else if(a==15)
				hex="F"+hex;
			else 
				hex=a+hex;
			dec/=16;
		}
		System.out.println("Equivalent hexa decimal number="+hex);		
	}
	
}