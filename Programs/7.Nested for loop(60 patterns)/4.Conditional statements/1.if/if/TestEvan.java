import java.io.*;
class Testodd {
	public static void main(String arg[]) {
		try{
			DataInputStream t=new DataInputStream(System.in);
			int a;
			System.out.println("enter a value");
			a=Integer.parseInt(t.readLine());
			//if (a%2==0)
				//System.out.println("a is a even number");
			if (a%2!=0)
				System.out.println("a is an odd number");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}