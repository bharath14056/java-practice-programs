import java.util.Scanner;
class reverse 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
	     int rev=0;
		 while(num>0)
			 {
			  int lastdigit=num%10;
			  rev=rev*10+lastdigit;
			 
			 num=num/10;
			 }
   		System.out.println(rev);
	}
}

