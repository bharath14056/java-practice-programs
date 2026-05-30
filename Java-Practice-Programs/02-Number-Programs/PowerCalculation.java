import java.util.Scanner;
class Power 
{
	static Scanner sc=new Scanner(System.in);
	public static int power(int b,int p)
	{
		int mul=1;
		for(int i=1;i<=p;i++)
		{
			mul=mul*b;
		}
		return mul;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter base:");
		int b=sc.nextInt();
		System.out.println("Enter power:");
	    int p=sc.nextInt();
		
		
	int ans =power(b,p);
		System.out.println(ans);
		
}

}