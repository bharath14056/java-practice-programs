class Maxofsubarray 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5};
		
		int n=a.length;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{int sum=0;
				for(int k=i;k<=j;k++)
				{
					System.out.println(a[k] +" ");
					sum=sum+a[k];
					
				}
			//System.out.println("The sum is:"+sum);
			maxSum=Math.max(maxSum,sum);
			}
		
	}System.out.println("The MAX  SUM is:"+maxSum);
}

}

/* output 

C:\java qs>java Maxofsubarray.java
1 The sum is:1
1 2 The sum is:3
1 2 3 The sum is:6
1 2 3 4 The sum is:10
1 2 3 4 5 The sum is:15
2 The sum is:2
2 3 The sum is:5
2 3 4 The sum is:9
2 3 4 5 The sum is:14
3 The sum is:3
3 4 The sum is:7
3 4 5 The sum is:12
4 The sum is:4
4 5 The sum is:9
5 The sum is:5
The MAX  SUM is:15

C:\java qs>java Maxofsubarray.java
1 1 2 1 2 3 1 2 3 4 1 2 3 4 5 2 2 3 2 3 4 2 3 4 5 3 3 4 3 4 5 4 4 5 5 The MAX  SUM is:15

C:\java qs>java Maxofsubarray.java
The MAX  SUM is:15

*/