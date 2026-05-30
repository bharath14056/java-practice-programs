import java.util.Arrays;
class Positivenegative 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,-3,4,-5,4,6,-4,1,2,4};
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
		if(arr[i]>=0 && arr[j]>=0)
			i++;
			
		else if (arr[i]<0 && arr[j]<0)
			j--;
		else if (arr[i]>=0 && arr[j]<0)
		{
			i++;
			j--;
		}
		else
			{
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

/* output 

C:\java qs>java Positivenegative.java
[1, 2, 4, 4, 2, 4, 6, 1, -4, -5, -3]

*/