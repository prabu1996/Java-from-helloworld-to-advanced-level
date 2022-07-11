import java.io.*;
class TestSmallestOf2 { 
	public static void main(String arg[]) { 
		try{
			DataInputStream t=new DataInputStream(System.in);
			int a,b;
			System.out.println("enter a");
			a=Integer.parseInt(t.readLine());
			System.out.println("enter b");
			b=Integer.parseInt(t.readLine());
			if (a<b) 
				System.out.println("a is the smallest number");
			else
				System.out.println("b is the smallest number");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}