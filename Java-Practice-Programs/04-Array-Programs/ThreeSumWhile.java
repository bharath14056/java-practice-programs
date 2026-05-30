import java.util.Scanner;

class Threesumwhile
{
	static Scanner sc=new Scanner(System.in);
	public static boolean find(int[] a,int target)
	{
		int i=0;
		int j=i+1;
		 int key =target-a[i];
		int k=a.length-1;
		
		
		while(j<k)
		{
			int sum=a[j]+a[k];
			if(sum==target)
				     return true;
			else if (sum>target)
			
				k--;
			
			else 
				j++;
			
			
			
		}return false;
		
	}
		

	
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5,8,9};
		System.out.print("\t\t\tEnter a target number:");
		int target=sc.nextInt();
		System.out.println((find(a,target)));
	}
}