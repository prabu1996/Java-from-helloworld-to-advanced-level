import java.io.*;
class TestRem {
	public static void main(String arg[]) {
		try {						
			DataInputStream t=new DataInputStream(System.in);
			int a,b,c,d;
			System.out.println("enter a");
			a=Integer.parseInt(t.readLine());
			System.out.println("enetr b");
			b=Integer.parseInt(t.readLine());
			c=a/b;
			d=a-(c*b);
			System.out.println("remainder is ...."+d);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}