import java.util.*;
class SubClass
{
	int n,i,x;
	String y="";
	public String function()
	{
		for(i=0;n>0;i++)
		{
			x=n%16;
			if(x==10)
				y="A"+y;
			else if(x==11)
				y="B"+y;
			else if(x==12)
				y="C"+y;
			else if(x==13)
				y="D"+y;
			else if(x==14)
				y="E"+y;
			else if(x==15)
				y="F"+y;
			else 
				y=x+y;
			n/=16;
		}
		return y;
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter decimal number");
		n=t.nextInt();
	}
	public void display()
	{
		getInput();
		System.out.println("Equivalent hexadecimal number="+function());
	}
}
class DecimalToHExadecimal3
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}