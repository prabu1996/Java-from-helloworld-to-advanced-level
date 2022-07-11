import java.util.*;
//function without arguments and without return values
class A
{
    int a,b,c;//data members
    public void add()// member functions
    {
        Scanner t=new Scanner(System.in);
        System.out.println("Enter a");
        a=t.nextInt();
        System.out.println("Enter b");
        b=t.nextInt();
        c=a+b;
	System.out.println("sum of two nos="+c);
    }
   public void display()
   {
       System.out.println("A="+a);
       System.out.println("B="+b);
    }
}
    
class TestAdd1
{
 	public static void main(String arg[])
	{
             
            A t1=new A();
	    t1.add();
	    t1.display();
         }
}

          



