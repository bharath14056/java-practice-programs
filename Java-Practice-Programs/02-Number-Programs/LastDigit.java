class  lastdigit
{
	public static void main(String[] args) 
	{
		int n=12345;
		
		System.out.println("your digit is:"+n);
		while(n>0){
			
			int lastdigit=n%10;
			n=n/10;
			
	     	System.out.println(" your digit is"+lastdigit);
		}
			
	}
	}
/*output
your digit is:12345
 your digit is5
 your digit is4
 your digit is3
 your digit is2
 your digit is1
*/