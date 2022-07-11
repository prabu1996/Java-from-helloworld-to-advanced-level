import java.util.*;
class A
{
	Scanner m=new Scanner(System.in);
	String v;
	public void function1()
	{
		System.out.println("Enter your number");
		int n=m.nextInt();
		int count=0;
		if(n>1)
		{
			for(int i=2;i<n+1;i++)
			{
				if(n%i==0)
					count+=(n/i);
				else
					count+=0;
			}
			if(count==n)
				System.out.println("Perfect number");
		}
		else 
			System.out.println("Non perfect number");

	}
	public String function1(int y)
	{
		int count=0;
		if(y>1)
		{
			for(int i=2;i<y+1;i++)
			{
				if(y%i==0)
					count+=(y/i);
				else
					count+=0;
			}
			if(count==y)
				v="Perfect number";
		}
		else 
			v="Non perfect number";
		return v;
	}
}
class PerfectNumber
{
	public PerfectNumber() 
	{
	}

	public static void main(String arg[])
	{
		 A t=new A();
		 t.function1();	
		 Scanner m=new Scanner(System.in);
		 System.out.println("Enter number");
		 int x=m.nextInt();
		 System.out.println(t.function1(x));
	}
}