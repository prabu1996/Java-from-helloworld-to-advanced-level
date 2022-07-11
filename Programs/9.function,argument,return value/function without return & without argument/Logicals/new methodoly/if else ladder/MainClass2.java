import java.util.*;
class SubClass
{
	String y;
	char x;
	int count;
	public void function()
	{
		if((x=='a')||(x=='A'))
			count=1;
		else if((x=='e')||(x=='E'))
			count=1;
		else if((x=='i')||(x=='I'))
			count=1;
		else if((x=='o')||(x=='O'))
			count=1;
		else if((x=='u')||(x=='U'))
			count=1;
		else 
			count=0;
		if(count==1)
			System.out.println("Entered character is an vowel");
		else
			System.out.println("Entered caharcter is an consonant");	
	}
	public void getData()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter your character");
		y=t.next();
		x=y.charAt(0);
		function();
	}
}
class MainClass2
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.getData();
	}
}