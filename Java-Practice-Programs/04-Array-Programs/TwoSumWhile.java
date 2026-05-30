import java.util.Scanner;

class Twosumwhile
{
	static Scanner sc=new Scanner(System.in);
	public static boolean find(int[] a,int target)
	{
		int i=0;
		int j=a.length-1;
		int ans[]={-1,-1};
		
		while(i<j)
		{
			int sum=a[i]+a[j];
			if(sum==target)
				     return true;
			else if (sum>target)
			
				j--;
			
			
			
			else 
				
			i++;
			
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

/* output
C:\java qs>java Twosumwhile.java
                        Enter a target number:14
true

C:\java qs>java Twosumwhile.java
                        Enter a target number:45
false  */
