import java.io.*;
class TestIf {
	public static void main(String arg[]) {
		try{
			DataInputStream t=new DataInputStream(System.in);
			int a,b;
			System.out.println("enter a value");
			a=Integer.parseInt(t.readLine());
			System.out.println("enter b value");
			b=Integer.parseInt(t.readLine());
			if (a>b)
			System.out.println("a is greater than b");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}