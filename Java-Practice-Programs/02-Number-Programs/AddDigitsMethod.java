
import java.util.Scanner;
class Adddigits
{
	static Scanner sc=new Scanner(System.in);
	public static int power(int b,int p)
	{
		int mul=1;
		for(int i=1;i<=p;i++)
		{
			mul=mul*b;
		}
		return mul;
	}
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("Enter base:");
		int b=sc.nextInt();
		System.out.println("Enter power:");
	    int p=sc.nextInt();
		int ans =power(b,p);
	
		System.out.println(ans);
		
		
	
	int sum=0;
		
		while(b>0){
			
			int ld=b%10;
			sum=sum+power(ld,p);
			
		}
		b=b/10;
	
	
}

}




