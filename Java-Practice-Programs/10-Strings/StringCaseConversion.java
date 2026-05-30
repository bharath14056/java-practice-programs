import java.util.Scanner;
class lowerupper
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.print("enter a character A to Z or a to z:");
		char ch=sc.next().charAt(0);
		
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("It is upper case");
		}
		else
		{
			System.out.println("It is lower case");
		}
	}
}
 

