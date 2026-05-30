import java.util.Arrays;
class Reversearray

{
	public static void main(String[] args) 
	{
	int a[]={10,20,30,40,50};
	int n=a.length;
		System.out.println("BEfore Reverse");
			System.out.println(Arrays. toString(a));
			
			int i=0;
			int j=n-1;
			while(i<j)
		{
				int  t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j--;
				
	}
	System.out.println(Arrays .toString(a));
}
}
/* output

C:\java qs>java Reversearray.java
BEfore Reverse
[10, 20, 30, 40, 50]
[50, 40, 30, 20, 10]
*/