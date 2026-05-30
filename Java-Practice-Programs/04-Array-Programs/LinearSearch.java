class Linearsearch 
{
	public static int  islinear(int arr[],int item)
	{
		int n=arr.length;
		for (int i=0;i<n;i++ )
		{
			if(arr[i]==item)
			{
				return i;
			
			}	
		
	
		}return-1;
	}

		
	public static void main(String[] args) 
	{
		int arr[]={12,52,48,15,63,1,20,7};
		int item=48;
		int ans=islinear(arr,item);
		System.out.println(ans);
	}
}
/*

C:\java qs>java Linearsearch.java
6

C:\java qs>java Linearsearch.java
2
*/