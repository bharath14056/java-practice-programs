class box 
{
	public static void main(String[] args) throws Exception
	{
		int n=8;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==0||j==n-1)
					  System.out.print("* ");
				else
					System.out.print("  ");
			
			Thread.sleep(10);}
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==0||j==n-1)
					  System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==0||j==n-1)
					  System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println("");
		}
	}
}

