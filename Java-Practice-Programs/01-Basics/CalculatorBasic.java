class calculator 
{
	public static void add()
	{
		int num1=100;
		int num2=200;
		int sum =num1+num2;
		System.out.println("addition is:"+sum);
	}
	public static void sub(int a,int b)
	{
		int sub=a-b;
		System.out.println("subtraction is "+sub);
	}
	public static void main(String[] args) 
	{
	  add();
		add();
		sub(500,400);
		sub(800,452);
		sub();
	}
}
