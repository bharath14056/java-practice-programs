class  Pairofarray
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				System.out.println(a[i]+","+a[j]);
			}
		
	}
}
}
/* output

C:\java qs>java Pairofarray.java
1,2
1,3
1,4
1,5
2,3
2,4
2,5
3,4
3,5
4,5
*/