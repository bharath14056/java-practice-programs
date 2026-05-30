import java.util.Arrays;
class Moveszero 
{
	public static void main(String[] args) 
	{
		int a[]={0,1,0,3,12};
		int b[]=new int[a.length];
		int k=0;
		int i=0;
		int n=a.length;
		
		while(i<a.length)
		{
			if(a[i]>0)
			{
				b[k] = a[i];
				k++;
		    	i++;
		}
			else
		{
				i++;
		}
		}
	
		System.out.println(Arrays.toString(b));
	
	}
	}
	
	
	
	/*
	int j=0;
		int i=0;
	while(j<n)
		{
		if(a[j]==0)
			j++;
	    else {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			i++;
			j++;
			
			
		}
		}
		System.out.println(Arrays.toString(a)); */



			
	/* output
	

C:\java qs>java Moveszero.java
[1, 3, 12, 0, 0]

*/