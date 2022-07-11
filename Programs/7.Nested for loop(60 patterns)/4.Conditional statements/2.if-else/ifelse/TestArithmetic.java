import java.io.*;
class TestArithmetic { 
	public static void main(String arg[]) {
		try{
			DataInputStream t=new DataInputStream(System.in);
			int x,y,z,operation;
			System.out.println("enter x");
			x=Integer.parseInt(t.readLine());
			System.out.println("enter y");
			y=Integer.parseInt(t.readLine());
			System.out.println("What operation u want to perform");
			operation=Integer.parseInt(t.readLine());
			if ((operation==1) or (operation==+))
				z=x+y	
			      	System.out.println("addition of x&y is = "+z );
			else if ((operation==2) or (operation==-))
				z=x-y
			   	System.out.println("subtraction of x&y is "+z);
			else if ((operation==3) or (operation==*))
				z=(x*y)
			   	System.out.println("Multiplication of x&y is= "+z);
			else if ((operation==4)or(operation==/)
				z=(x/y)
				System.out.println("Division of x&y is= "+z);
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}