class Perfectsquare 
{
public static boolean isPerfectsquare(int n)
	{
         for (int i=n;i<=n;i++)
		{
			 
		
		int sq=n*n;
		if (n==sq)
	
		{
		return true;
		}
		
		
		

	

	}return false;
	} 
	public static void main(String[] args) 
	{
		int n=25;
		boolean ans=isPerfectsquare(n);
		System.out.println(ans);
	}
}
