class Sumsubarray 
{
	public static void main(String[] args) 
	{
		
		int a[]={1,2,3,4,5};
		
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{int sum=0;
				for(int k=i;k<=j;k++)
				{
					System.out.print(a[k] +" ");
					sum=sum+a[k];
					
				}
			System.out.println("The sum is:"+sum);
			}
		
	}
}
}
/* output

C:\java qs>java SumSubarray.java
1
3
6
10
15
2
5
9
14
3
7
12
4
9
5
*/
/*
C:\java qs>java SumSubarray.java
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
*/