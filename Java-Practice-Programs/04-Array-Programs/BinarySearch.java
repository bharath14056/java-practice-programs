import java.util.Arrays;
class BinarySearch 
{
	public static int BinarySearch(int arr[],int key){
		int i=0;
		int j=arr.length-1;
		
		while(i<=j)
		{
			int mid=(i+j)/2;
			if(arr[mid]==key){
				return mid;
			}
			else if(key<arr[mid]){
				j=mid-1;
			}
			else{
				i=mid+1;
			}
		}return -1;
	
	}

	public static void main(String[] args) 
	{
		
		int arr[]={3,24,31,42,52,62,72};
		int key=52;
		
		System.out.println(BinarySearch(arr,key));
	}
}
/*
output

C:\java qs>java BinarySearch.java
4
*/
