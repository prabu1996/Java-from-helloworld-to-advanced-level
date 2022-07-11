import java.util.Scanner;
class Box
{
	public double add()
	{
		double l,h,w;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter length");
		l=t.nextDouble();
		System.out.println("Enter height");
		h=t.nextDouble();
		System.out.println("Enter width");
		w=t.nextDouble();
		return l+h+w;	
	}
}
class MainAdd
{
	public static void main(String arg[])
	{
		double sum;
		Box m=new Box();
		sum=m.add();
		System.out.println("Additon of sides="+sum);
	}
}