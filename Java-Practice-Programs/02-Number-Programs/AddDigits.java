class adddigits

{
	public static void main(String[] args) 
	{
	int n=12345;
	int sum=0;
		
		System.out.println("your digit is:"+n);
		while(n>0){
			
			int lastdigit=n%10;
			sum=sum+lastdigit;
			
		}
		n=n/10;
	}System.out.println(" your sum is"+sum);
		
	
}
/*output
your digit is:12345
 your sum is15
 */ 