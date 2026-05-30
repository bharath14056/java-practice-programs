class palindrome 
{
	public static void main(String[] args) 
		
	{
		int n=184;
		int rev=0;
		int originalNumber=n;
		while(n>0)
		{
			int ld=n%10;
			rev=rev*10+ld;
			n=n/10;
		}
		
	
		System.out.println("it sa palindrome"+rev);
	}
}
