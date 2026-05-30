class Stock1 
{
	public static void main(String[] args) 
	{
		int prices[]={7,1,5,3,6,4};
		int n=prices.length;
		int maxprofit=0;
		int profit=0;
		int min =prices[0];
		for (int i=0;i<n ;i++ )
		{
			if (prices[i]<min)
			{
				min=prices[i];
			}
				
				profit=prices[i]-min;
				 maxprofit=Math.max(profit,maxprofit);
			}
		System.out.println(maxprofit);
		
	}
}

