package PrimeNumber;
import java.util.Scanner;
class A
{
	public void function()
	{
		Scanner t=new Scanner(System.in);
		int count=0;
		System.out.println("Enter your number");
		int n=t.nextInt();
		if(n>0)
		{
			for(int i=1;i<n+1;i++)
			{
				if(n%i==0)
					count+=1;
			}
		}
		if((n<=0)||(count!=2))
			System.out.println("Non prime number");
		else 
			System.out.println("prime number");
	}
}
public class PrimeNumber 
{
	public PrimeNumber()
	{
	}
	public static void main(String[] args) 
	{
		A t=new A();
		t.function();
		
	}

}
