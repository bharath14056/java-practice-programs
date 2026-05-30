import java.util.Arrays;
class Checksorted
{
	public static boolean issorted(int a[])
	{
		 int n=a.length;
		
		for(int i=0;i<n-1;i++)                                           
		{
		if(a[i]>a[i+1]){
		
		return false;
		}
		
		}return true;
	}
	public static void main(String[] args) 
	{
		int a[]={10,20,80,50};
     	
		boolean ans=issorted(a);
		if (ans==true)
		{
			System.out.println("Sorted array");
		}
		else{
			System.out.println(" Not Sorted array");
		}
	   
		
		
		
	}
}
/* Output

C:\java qs>java Checksorted.java
Sorted array

C:\java qs>java Checksorted.java
 Not Sorted array
 */

