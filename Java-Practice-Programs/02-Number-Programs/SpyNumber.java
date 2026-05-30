import java.util.Scanner;
class  spy
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter a number:");
	     int num=sc.nextInt();
		 int sum=0;
		 int mul=1;
	while(num>0){
			 int ld =num%10;
			  sum=sum+ld;
			  mul=mul*ld;
	
			 num=num/10;
	}
	      		 	System.out.println(+sum);
              	System.out.println(+mul);
			 if(sum==mul)
		{
				 System.out.println("it is a spy");
		}
		else
			System.out.println("not a spy");
			 }
	}
	
	

