import java.util.Scanner;
class multiple 
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(num%10==0)
		{
			System.out.println("this multiple");
		}
		else{
			System.out.println("this not multiple");
		}
	}
}
