class  Stock
{
	public static void main(String[] args) 
	{
		int prices[]={7,1,5,3,6,4};
		int n=prices.length;
		int maxprofit=0;
		for (int i=0;i<n ;i++ )
		{
			for (int j=i+1;j<n ;j++ )
			{
				int profit=prices[j]-prices[i];
				maxprofit=Math.max(profit,maxprofit);
			}
		}
		System.out.println(maxprofit);
	}
}
