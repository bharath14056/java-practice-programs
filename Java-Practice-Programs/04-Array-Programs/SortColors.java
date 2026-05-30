import java.util.Arrays;
class  Sortedcolour
{
	public static void  Sorted(int nums[])
	{
		int i=0;
		int j=nums.length-1;
		int k=0;
		
		while (k<=j)
		{
			if (nums[k]==0)
			{
				int temp=nums[i];
				nums[i]=nums[k];
			nums[k]=temp;
				i++;
				k++;
			}
			
			else if (nums[k]==1)
			{
				
				k++;
			}
			else
			{
				int temp=nums[j];
				nums[j]=nums[k];
				nums[k]=temp;
				
				j--;
	
			
			
			}
			
		}
			
	}
	public static void main(String[] args) 
	{
		int nums[]={2,0,1};
		Sorted(nums);
		System.out.println(Arrays.toString(nums));
	}
}


/* output 

C:\java qs>java Sortedcolour.java
[0, 0, 0, 1, 1, 2]

C:\java qs>java Sortedcolour.java
[0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2]

*/