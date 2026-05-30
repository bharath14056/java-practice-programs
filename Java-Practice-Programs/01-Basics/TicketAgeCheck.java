import java.util.Scanner;
class ticket
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter your age");
		int age=sc.nextInt();
		
		System.out.println("-----------------------");
		System.out.println("-----------------------");
		
		if(age<5){
			System.out.println("your ticket is free");
			
			System.out.println("-----------------------");
			System.out.println("-----------------------");
		}
		else if(age<=12){
			System.out.println("your ticket price is ");
			
			System.out.println("-----------------------");
			System.out.println("-----------------------");
		}
		else if(mark>=45)
			{
			System.out.println("your grade is C");
			
			System.out.println("-----------------------");
			System.out.println("-----------------------");
			}
		else if(mark>=35)
		{
			System.out.println("your grade is D");
			
			System.out.println("-----------------------");
			System.out.println("-----------------------");
		}
		else{
			System.out.println("your fail");
			
			System.out.println("-----------------------");
			System.out.println("-----------------------");
			

		}
	}
}

 
