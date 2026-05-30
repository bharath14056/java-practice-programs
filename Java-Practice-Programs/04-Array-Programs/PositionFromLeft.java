import java.util.Arrays;
class Positionleft
{
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40,50};
     	int n=a.length;
		int start=a[0];
	
		for(int i=1;i<n;i++)
		{
			a[i-1]=a[i];
		}
		a[n-1]=start;
		
		System.out.println(Arrays.toString(a));
	}
}
