import java.util.Scanner;
class fizzbuzz 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number:");	  
		int num=sc.nextInt();
		if(num%3==0 && num%5==0)
		{
		System.out.println("fizzbuzz");
		}
		else if(num%3==0)
		{
			System.out.println("Fizz");
			
		}
		else if(num%5==0)
		{
			System.out.println("BUZZ");
	}
	 
		else
		{
			System.out.println("sorry bro");
		}
}
}
