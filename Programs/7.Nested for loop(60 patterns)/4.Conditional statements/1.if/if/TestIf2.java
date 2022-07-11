import java.io.*;
class TestIf2 {
	public static void main(String arg[]) {
		try{
			DataInputStream t=new DataInputStream(System.in);
			int a,b;
			System.out.println("enter a value");
			a=Integer.parseInt(t.readLine());
			System.out.println("enter b value");
			b=Integer.parseInt(t.readLine());
			if (b>a)
				System.out.println("b is greater than a");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}