import java.util.Scanner;
class hotel
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
	int  option=sc.nextInt();
	    
	   
		 double balance =5.20;
          int pinno=1405;
          long regphno=7695;
		  
		
	      
		  
	do{
		System.ou.println("Welcome to miggy");
		System.out.println("1.AMMA hotel \n2.A2B\n3.PS4  \n4.hotel thango");
		    System.out.print("select one option:");
            option=sc.nextInt();
			
		
	switch(option)
		{	
		 
		
		case 1:System.out.println("welcome to AMMA hotel ");
		            System.out.println("enter the food you want \n1. muttonbiriyani\n2.chicken biryani\n.friedrice  ");
					int option=sc.nextInt();
					
					 System.out.println(" enter the want to  deposit:");
		            double deposit=sc.nextDouble();
					balance=balance+deposit;
					System.out.println("your amout scusscefully deposit");
					System.out.println("your amout  deposit amount:"+balance);
					System.out.println("you are in  withdrawl");
		             double withdrawl=sc.nextDouble();
					 System.out.print("enert your pin");
					  int newpinnum=sc.nextInt();
					 if(newpinnum==pinno)
			             {
						 System.out.println("correct:");
						
						 if (withdrawl<=balance)
						 {
						 
			           balance=balance-withdrawl ;
					   System.out.println("after withdrawl your current amount is"+balance+"rs");
					    }
						 
						 else{
							System.out.println("insufficient balance");
								
						 }}
					else{
						System.out.println("pin no is inncorrect");
					}
					System.out.println("enter your registerd phno:");
		             long phno=sc.nextLong();
					 
					 if(regphno==phno){
						 int otp=(int)(Math.random()*9000)+1000;
						 System.out.println("enter the otp:"+otp);
						 System.out.println("enter your  otp:");
						 int userotp=sc.nextInt();
						 
						 if(otp==userotp)
							 {
							 
								System.out.println("enter your updated pin :");
								int newpin=sc.nextInt();
								pinno=newpin;
								System.out.println("your pin is updated:");
								System.out.println("pincode is:"+pinno);
							 }
							 else
						 {
							System.out.println("worng otp");
						 }}
						  else
						 {
							System.out.println("worng mobile no");
						 }
		case 2:System.out.println(" enter the want to  deposit:");
		            double deposit=sc.nextDouble();
					balance=balance+deposit;
					System.out.println("your amout scusscefully deposit");
					System.out.println("your amout  deposit amount:"+balance);
					break;
		case 3:System.out.println("you are in  withdrawl");
		             double withdrawl=sc.nextDouble();
					 System.out.print("enert your pin");
					  int newpinnum=sc.nextInt();
					 if(newpinnum==pinno)
			             {
						 System.out.println("correct:");
						
						 if (withdrawl<=balance)
						 {
						 
			           balance=balance-withdrawl ;
					   System.out.println("after withdrawl your current amount is"+balance+"rs");
					    }
						 
						 else{
							System.out.println("insufficient balance");
								
						 }}
					else{
						System.out.println("pin no is inncorrect");
					}
	
						 
						
		              break;
		case 4:System.out.println("enter your registerd phno:");
		             long phno=sc.nextLong();
					 
					 if(regphno==phno){
						 int otp=(int)(Math.random()*9000)+1000;
						 System.out.println("enter the otp:"+otp);
						 System.out.println("enter your  otp:");
						 int userotp=sc.nextInt();
						 
						 if(otp==userotp)
							 {
							 
								System.out.println("enter your updated pin :");
								int newpin=sc.nextInt();
								pinno=newpin;
								System.out.println("your pin is updated:");
								System.out.println("pincode is:"+pinno);
							 }
							 else
						 {
							System.out.println("worng otp");
						 }}
						  else
						 {
							System.out.println("worng mobile no");
						 }
	                  break;
	    default : System.out.println("give valid option");
	
	}
	
}while(option!=0);

	}
}


