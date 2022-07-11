import java.util.Scanner;
class Box
{
	public double div()
	{
		double l,h;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter length");
		l=t.nextDouble();
		System.out.println("Enter height");
		h=t.nextDouble();
		return l/h;	
	}
}
class MainDiv
{
	public static void main(String arg[])
	{
		Box m=new Box();
		double x=m.div();
		System.out.println("divison of sides="+x);
	}
}