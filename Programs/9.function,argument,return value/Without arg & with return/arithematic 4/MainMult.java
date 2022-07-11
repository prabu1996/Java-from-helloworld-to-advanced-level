import java.util.Scanner;
class Box
{
	public double volume()
	{
		double l,w,h;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter length");
		l=t.nextDouble();
		System.out.println("Enter height");
		h=t.nextDouble();
		System.out.println("Enter width");
		w=t.nextDouble();
		return l*h*w;	
	}
}
class MainMult
{
	public static void main(String arg[])
	{
		double vol;
		Box m=new Box();
		vol=m.volume();
		System.out.println("Volume of box="+vol);	
	}
}