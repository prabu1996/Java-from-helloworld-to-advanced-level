import java.util.Scanner;
class Box
{
	public double sub()
	{
		double l,h,w;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter length");
		l=t.nextDouble();
		System.out.println("Enter height");
		h=t.nextDouble();
		System.out.println("Enter width");
		w=t.nextDouble();
		return l-h-w;	
	}
}
class MainSub
{
	public static void main(String arg[])
	{
		Box m=new Box();
		double dif=m.sub();
		System.out.println("Additon of sides="+dif);
	}
}