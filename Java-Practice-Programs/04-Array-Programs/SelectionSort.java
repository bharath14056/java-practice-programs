import java.util.Arrays;
class Selectionsort 
{
	public static void main(String[] args) 
	{
		int a[]={50,40,30,20,10};
		
		 System.out.println("before sorting"+Arrays.toString(a));
		for (int i=0;i<a.length ;i++ )
		{
			int min=i;
			for (int j=i+1;j<a.length;j++ )
			{
				if (a[j]<a[min])
				{
					min=j;
					}
			}
					int temp=a[i];
					a[i]=a[min];
					a[min]=temp;
				
				
			
		}System.out.println();
		System.out.println("After sorting"+Arrays.toString(a));
	}
	}
	
/*

C:\java qs>java Selectionsort.java
before sorting[50, 40, 30, 20, 10]

After sorting[10, 20, 30, 40, 50]  

*/
