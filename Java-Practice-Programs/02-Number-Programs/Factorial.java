import java.util.Scanner;
class factorial 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter a number:");
		int n=sc.nextInt();
		
		int fact=1;
		
		for (int i=1;i<=n;i++ )
		{
			fact=fact*i;
		}
		System.out.println("the factorial:"+fact);
	}
}
