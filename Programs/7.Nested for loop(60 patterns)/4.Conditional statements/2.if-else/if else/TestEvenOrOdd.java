import java.io.*;
class TestEvenOrOdd { 
	public static void main(String arg[]) { 
		try{
			DataInputStream t=new DataInputStream(System.in);
			int num;
			System.out.println("enter a");
			num=Integer.parseInt(t.readLine());
			if (num%2==0) 
				System.out.println("a is even");
			else
				System.out.println("a is odd");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}