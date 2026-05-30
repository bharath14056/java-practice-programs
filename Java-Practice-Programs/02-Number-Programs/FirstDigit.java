class firstdigit 
{
	public static void main(String[] args) 
	{
		int n=72345;
		
		System.out.println("your digit is:"+n);
		while(n>9){
			
			int firstdigit=n%10;
		System.out.println(" your digit is"+firstdigit);	
			n=n/10;
			
	     
		}
	System.out.println("the firstdigit  is:"+n);		
	}
}
/* output
C:\java qs>java firstdigit.java
your digit is:12345
 your digit is5
 your digit is4
 your digit is3
 your digit is2
the num is:1
*/