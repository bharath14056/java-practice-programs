class Strongnumber
{
	public static int factorial(int n)
	{
		int fact =1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[]args)
	{
		int n=145;
		int sum=0;
		int tem =n;
		while(n>0)
		{
			int ld=n%10;
			sum =sum+factorial(ld);
			n=n/10;
		}
		System.out.println()
}