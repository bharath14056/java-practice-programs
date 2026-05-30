import java.util.Scanner;
class evencount 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int sum=0;
		int c=0;
		while(num>0)
		{
			int lastdigit=num%10;
			System.out.println("the last digits are:"+lastdigit);
			if(num%2==0)
			{
				c++;
				sum=sum+lastdigit;
			
			}
			num=num/10;
	}System.out.println("the sum is:"+sum);
	System.out.println("the count is :"+c);
}
}

/* output
enter a number:
5484
the last digits are:4
the last digits are:8
the last digits are:4
the last digits are:5
the sum is:16
the count is :3
*/