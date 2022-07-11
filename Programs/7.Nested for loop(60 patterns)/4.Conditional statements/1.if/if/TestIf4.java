import java.io.*;
class TestIf4 {
	public static void main(String arg[]) {
		try{
			DataInputStream t=new DataInputStream(System.in);
			int a;
			System.out.println("enter a value");
			a=Integer.parseInt(t.readLine());
			//System.out.println("enter b value");
			//b=Integer.parseInt(t.readLine());
			//if (a!=0)
				//System.out.println("a is either positive or negative");
			//if (a>0)
				//System.out.println("a is a positive number");
			if (a<0)
				System.out.println("a is a negative number");
			//if (a>=0)
				//System.out.println("a is either zero or positive number");
			//if (a<=0)
				//System.out.println("a is either zero or negative number");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}