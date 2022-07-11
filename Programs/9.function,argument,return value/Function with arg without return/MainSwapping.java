import java.util.*;
class SubClass
{
	public void SubMethod(int x,int y,int z)
	{
		int i=x;
		x=y;
		y=z;
		z=i;
		System.out.println("a="+x);
		System.out.println("b="+y);
		System.out.println("c="+z);		
	}

}
class MainSwapping
{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner m=new Scanner(System.in);
		System.out.println("Enter a");
		a=m.nextInt();
		System.out.println("Enter b");
		b=m.nextInt();
		System.out.println("Enter c");
		c=m.nextInt();
		SubClass t=new SubClass();
		t.SubMethod(a,b,c);// dont put int a,int b,int c				
	}
}
