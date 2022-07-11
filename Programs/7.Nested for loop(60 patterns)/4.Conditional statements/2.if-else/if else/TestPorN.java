import java.io.*;
class TestPorN { 
	public static void main(String arg[]) { 
		try{
			DataInputStream t=new DataInputStream(System.in);
			int a;
			System.out.println("enter a");
			a=Integer.parseInt(t.readLine());
			if (a>=0) 
				System.out.println("a is the positive number");
			else
				System.out.println("a is the negative number");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}