class Subarray 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5};
		
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(a[k]);
					
				}
			System.out.println();
			}
		
	}
}
}
/* output

C:\java qs>java Subarray.java
1
12
123
1234
12345
2
23
234
2345
3
34
345
4
45
5
*/