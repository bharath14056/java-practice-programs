import java.util.Arrays;
class Duplicate 
{
	public static void main(String[] args) 
	{
		
		int arr[]={1,2,3,5,5,4,8,6,4,1,16,4,8,16,4,5,7,16};
		Arrays. sort(arr);
		System.out.println(Arrays.toString (arr));
		
		int n=arr.length;
		
		for (int i=0;i<n-1 ;i++ )
		{
			int j=i;
			if (arr[i]==arr[j+1])
			{
				
				System.out.println(" The Duplicate are:"+arr[i]);
			}
			
		}
	}
}

/* output 
C:\java qs>java Duplicate.java
[1, 1, 2, 3, 4, 4, 4, 4, 5, 5, 5, 6, 7, 8, 8, 16, 16, 16]
 The Duplicate are:1
 The Duplicate are:4
 The Duplicate are:4
 The Duplicate are:4
 The Duplicate are:5
 The Duplicate are:5
 The Duplicate are:8
 The Duplicate are:16
 The Duplicate are:16
 */