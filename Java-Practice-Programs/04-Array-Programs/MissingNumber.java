import java.util.Arrays;
class  Missingnumber 
{
	public static void main(String[] args) 
	{
		int n=5;
		int arr[]={1,3,2,5};
		int exceptedsum=(n*(n+1))/2;
		int sum=0;
		
		
	  for(int i=0;i<arr.length;i++)
		{
		 sum=sum+arr[i];
		}
		int missing=exceptedsum-sum;
		
		
		System.out.println("The missing number is:"+missing);
		System.out.println("The excepted sum is:"+exceptedsum);
		System.out.println("The sum is:"+sum);
	}
	}
/*output

C:\java qs>java Missingnumber.java
The missing number is:4
The excepted sum is:15
The sum is:11
*/