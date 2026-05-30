import java.util.Scanner;
class divisble 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		if((num%3==0) &&(num%5==0)){
			System.out.println("the given number is divisble");
		}
		else{
			System.out.println("the given number not is divisble");
			
			
		}
	}
}
