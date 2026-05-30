class Maxsubarraysingleloop 
{
	public static void main(String[] args) 
	{
		int a[]={-2,1,-3,4,-1,2,1,-5,4};
		int sum=0;
		int n=a.length;
	    int  maxSum=Integer.MIN_VALUE;
		
		for (int i=0;i<n ;i++ )
		{
			sum=sum+a[i];
			maxSum=Math.max(sum,maxSum);
			if(sum<0)
				sum=0;
				
		}
		System.out.println("The maxsubarray is "+maxSum);
	}
}
/* output 

C:\java qs>java Maxsubarraysingleloop.java
6

C:\java qs>java Maxsubarraysingleloop.java
The maxsubarray is 6
*/
