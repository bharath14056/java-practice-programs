class Stock2 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,5,6,9,4};
			int profit=0;
		int totalprofit=0;
		for (int i=0;i<a.length-1 ;i++)
		{
			if(a[i+1]>a[i])
			{
				profit=a[i+1]-a[i];
				totalprofit=totalprofit+profit;
			}
			
		}System.out.println("The total profit is : "+totalprofit);
	}
}
/* output
C:\java qs>java Stock2.java
The total profit is : 8
*/