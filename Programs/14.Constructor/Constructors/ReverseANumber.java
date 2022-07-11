import java.util.*;
public class A
{
	public void function()
	{
		
		Scanner m=new Scanner(System.in);
		System.out.println("Enter your number");
		String num=m.next();
		int n=num.length();
		String x="";
		for(int i=n-1;i>=0;i--)
		{
			x=num.charAt(i)+x;	
		}
		System.out.println("Reversed number="+x);
	}
}
public class ReverseANumber 
{
	public ReverseANumber ()
	{
	}
	public static void main(String[] args) 
	{
		A t=new A();
		t.function();
	}

}
