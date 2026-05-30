import java.util.Scanner;
class min
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		long n=sc.nextInt();
		long min=Integer.MAX_VALUE;
		while(n>0)
		{
			long lastdigit=n%10;
			  min=Math.min(lastdigit,min);
			System.out.println(lastdigit);
			n=n/10;
			
		
	}System.out.println("the max value is:"+min);
}
}
/*
enter a number
01253
3
5
2
1
the max value is:1*/