import java.util.Scanner;
class GCD
{
	static Scanner sc= new Scanner(System.in);
	public static  int findGcd(int a,int b)
	{
		int gcd=1;
		int n=Math.min(a,b);
		for (int i=1;i<=n;i++ )
		{
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		return gcd;
		}
		public static void main(String args[])
	{
			System.out.println("Enter a :");	
		int a=sc.nextInt();
		System.out.println("Enter b:");	
		int b=sc.nextInt();
			
			
			int ans=findGcd(a,b);
			System.out.println(ans);
}
}
/*  output

C:\java qs>java GCD.java
9

C:\java qs>java GCD.java
9

C:\java qs>java GCD.java
2



C:\java qs>java GCD.java
Enter a :
45
Enter b:
12
3
*/