import java.util.Scanner;
class voterid 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter your name");
		String name=sc.next();
		
		System.out.print("enter your age:");
		int age=sc.nextInt();
		
		System.out.print("Voter id:");
		char ch=sc.next().charAt(0);
		
		
		
		if(age>=18 && ch=='Y' || ch=='N'){
			System.out.println("your are eligible for vote:");
		}
		else
		{
			System.out.println("Your not eligible to vote");
		}
	}
}
       