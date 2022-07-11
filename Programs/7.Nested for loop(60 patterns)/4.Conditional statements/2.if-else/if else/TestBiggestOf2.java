import java.io.*;
class TestBiggestOf2 { 
	public static void main(String arg[]) { 
		try{
			DataInputStream t=new DataInputStream(System.in);
			int a,b;
			System.out.println("enter a");
			a=Integer.parseInt(t.readLine());
			System.out.println("enter b");
			b=Integer.parseInt(t.readLine());
			if (a>b) 
				System.out.println("a is the biggest number");
			else
				System.out.println("b is the biggest number");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}