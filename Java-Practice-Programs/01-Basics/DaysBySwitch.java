	import java.util.Scanner;
class days 
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the day number:");
		int n=sc.nextInt();
		
		switch(n)
		{
			case 1: System.out.println("today is sunday");
			             System.out.println("today i will watch movie");
						 break;
			case 2: System.out.println("today is monday");
			             System.out.println("today i will study java");
						 break;
			case 3: System.out.println("today is TUES DY");
			             System.out.println("today i will study java");
						 break;
			case 4: System.out.println("today is monday");
			             System.out.println("today i will study java");
						 break;
			 case 5: System.out.println("today is monday");
			             System.out.println("today i will study java");
						 break;
		   	 case 6: System.out.println("today is monday");
			             System.out.println("today i will study java");
						 break;
						 
			 case 2: System.out.println("today is monday");
			             System.out.println("today i will study java");
						 break;
						 
			default:System.out.println("no such day take rest:");
						 
		}
		
	}
}
