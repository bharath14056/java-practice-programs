import java.util.Scanner;
class max 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		long n=sc.nextInt();
		long max=Integer.MIN_VALUE;
		while(n>0)
		{
			long lastdigit=n%10;
			max=Math.max(lastdigit,max);
			System.out.println(lastdigit);
			n=n/10;
			
		
	}System.out.println("the max value is"+max);
}
}
/*output
enter a number
75487548
8
4
5
7
8
4
5
7
the max value is:8
*/