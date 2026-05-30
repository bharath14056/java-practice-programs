class addfirstlast 
{
	public static void main(String[] args) 
	{
		int n=81272;
		
		
			
			int lastdigit=n%10;
			n=n/10;
			
	     	System.out.println(" your digit is"+lastdigit);
	
	while(n>9){
			
			int firstdigit=n%10;
		System.out.println(" your digit is"+firstdigit);	
			n=n/10;
			
	     
		}
	
	 int sum=lastdigit+n;
	System.out.println(sum);


	}
	
}
/* outpu

C:\java qs>java addfirstlast.java
 your digit is2
 your digit is7
 your digit is2
 your digit is1
10   */
