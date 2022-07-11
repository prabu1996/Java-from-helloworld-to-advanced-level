;// interactive method
import java.io.*;
class TestAdd2
{
     public static void main(String arg[])
   {
      try
      {
            DataInputStream t=new DataInputStream(System.in);
            int a,b,c;
            System.out.println("Enter a");
            a=Integer.parseInt(t.readLine()); //readline is a dynamic method coz it is called by object
            System.out.println("Enter b");
            b=Integer.parseInt(t.readLine());
            c=a+b;
            System.out.println("sum of two nos="+c);
        }
       catch(Exception e)
       {
                System.out.println(e);
       }
   // System.out.println("rest of the code");
   }
}