import java.util.Arrays;
class Duplicatearray 
{
	public static boolean  isDuplicate(int arr[])
	{
				for(int i=0;i<arr.length;i++){
							for(int j=0;j<arr.length;j++){
								if(arr[i]==arr[j]){
									return true;
								}
									
								}
				}return false;
	}
	public static void main(String[] args) 
	{
		int arr[]={30,40,50,30,70};
		int n=arr.length;
		boolean ans=isDuplicate(arr);
		System.out.println(ans);
		
	}
}

/* output

C:\java qs>java Duplicatearray.java
false

C:\java qs>java Duplicatearray.java
true
*/

