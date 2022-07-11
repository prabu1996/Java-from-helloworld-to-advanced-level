import java.util.*;
class SubClass
{
	int n,i,x;
	String y="";	
	public String function(int m)
	{
		for(i=0;m>0;i++)
		{
			x=m%16;
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
			m/=16;
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
		System.out.println("Equivalent hecadecimal number="+function(n));
	}
}
class DecimalToHExadecimal4
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}