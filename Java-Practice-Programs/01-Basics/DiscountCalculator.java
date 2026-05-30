import java.util.Scanner;
class discount
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter your purchasing amount");
		float amount=sc.nextFloat();
		
		System.out.println("-----------------------");
		System.out.println("-----------------------");
		
		if(amount>=5000){
			System.out.println("your discount is 50%");
			amount=(amount*50)/100;
			System.out.println("you have to pay:"+amount);
			
			System.out.println("-----------------------");
			System.out.println("-----------------------");
		}
		else if(amount>=4000){
			System.out.println("your discount is 40%");
			amount=(amount*40)/100;
			System.out.println("you have to pay:"+amount);
			System.out.println("-----------------------");
			System.out.println("-----------------------");
		}
		else if(amount>=3000){
			System.out.println("your discount is 30%");
			amount=(amount*30)/100;
			System.out.println("you have to pay:"+amount);
			
			System.out.println("-----------------------");
			System.out.println("-----------------------");
			}
		
		else{
			System.out.println("sorry bro");
			
			System.out.println("-----------------------");
			System.out.println("-----------------------");
			

		}
	}
}

 
