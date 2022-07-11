import java.io.*;
class Addition {
	public static void main(String arg[]) {
		try{
			DataInputStream t=new DataInputStream(System.in);
			int x,y,z;
			System.out.println("enter x");
			x=Integer.parseInt(t.readLine());
			System.out.println("enter y");
			y=Integer.parseInt(t.readLine());
			z=(x*y);
			System.out.println("multip of x&y is  "+z);
		}
		catch (Exception e) { 
			System.out.println(e);
		}		
	
		
	}

}