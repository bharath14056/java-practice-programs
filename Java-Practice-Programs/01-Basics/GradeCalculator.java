import java.util.Scanner;
class grade
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the mark");
		float mark=sc.nextFloat();
		
		System.out.println("-----------------------");
		System.out.println("-----------------------");
		
		if(mark>=85){
			System.out.println("your grade is A");
			
			System.out.println("-----------------------");
			System.out.println("-----------------------");
		}
		else if(mark>=60){
			System.out.println("your grade is B");
			
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

 
