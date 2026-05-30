import java.util.Scanner;
import java.util.Arrays;
class Twosum                                                                                                                                                                                                                                      
{
	static Scanner sc=new Scanner(System.in);
	public static int[] find(int[] arr,int target)
	{
		int ans[]={-1,-1};
		int n=arr.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					ans[0]=i;
					ans[1]=j;
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,8,9};
		System.out.print("\t\t\tEnter a target number:");
		int target=sc.nextInt();
		System.out.println(Arrays.toString(find(arr,target)));
	}
}

/* output 

C:\java qs>java Twosum.java
                        Enter a target number:4
[0, 2]

C:\java qs>java Twosum.java
                        Enter a target number:3
[0, 1]

C:\java qs>java Twosum.java
                        Enter a target number:7
[2, 3]
*/