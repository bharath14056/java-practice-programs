import java.util.Arrays;
class Maxconsecutiveones 
{
	public static void main(String[] args) 
	{
		int arr[]={1,1,1,1,1,1,0,0,1,1,0,1,1,1,1};
	int maxcount=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]==1)){
				count++;
			      maxcount=Math.max(count,maxcount);
			}
			else{
			
				count=0;
			}
	}
	System.out.println("The MAX consecutive is:"+count);
}
}

/* output

C:\java qs>java Maxconsecutiveones.java
The MAX consecutive is:3


C:\java qs>java Maxconsecutiveones.java
The MAX consecutive is:4
*/