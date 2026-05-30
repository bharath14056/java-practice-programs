import java.util.Scanner;
class leapyear 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a year");
		int year=sc.nextInt();
		
		if((year%400==0)||(year%4==0 && year%100!=0)){
			System.out.println("it is a leap year");
		}
		else{
			System.out.println("it is not leap year");
			
			
		}
	}
}
