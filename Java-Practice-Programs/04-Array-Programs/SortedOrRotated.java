class SorrtedorRotated
{
	public static boolean isSort(int nums[])
	{   int count=0;
		int n=nums.length;
		for (int i=0;i<n-1;i++ )
		{
			if(nums[i]>nums[i+1])
			{
				count++;
			}
			if(count<=1)
				
				return true;
				
			
			
			
		
	
		}return false;	
	
	}

		
	public static void main(String[] args) 
	{
		int nums[]={3,4,5,1,2};
		
		boolean ans=isSort(nums);
		System.out.println(ans);
	}
}
/*

C:\java qs>java Linearsearch.java
6

C:\java qs>java Linearsearch.java
2
*/