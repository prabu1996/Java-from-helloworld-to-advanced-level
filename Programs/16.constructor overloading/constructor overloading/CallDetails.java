class User1
{
	String CallerName;
	int CallDuration1,callcost,CallDuration2;
	public User1(String CallerName,int CallDuration1)
	{
		this.CallDuration1=CallDuration1;
		this.CallerName=CallerName;		
	}
	public User1(String CallerName,int CallDuration1,int callcost)
	{
		this.CallDuration1=CallDuration1;
		this.CallerName=CallerName;
		this.callcost=callcost;	
	}
	public User1(int CallDuration1,int CallDuration2,String CallerName)
	{
		this.CallDuration1=CallDuration1;
		this.CallerName=CallerName;
		this.CallDuration2=CallDuration2;
	}
	public void display()
	{
		System.out.println(CallerName +" "+CallDuration1 +" "+ callcost +" " + CallDuration2);
	}
}
class CallDetails
{
	public static void main(String arg[])
	{
		User1 m=new User1("abi",20);
		//User1 m=new User1("abi",20,30);
		//User1 m=new User1(10,20,"pushpam");
		m.display();	
	}
}