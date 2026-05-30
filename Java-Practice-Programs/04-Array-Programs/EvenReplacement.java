import java.util.Arrays;
class Evenreplacement 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,6,9,13,5,8,5,1,2};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				arr[i]=arr[i]*10;
			else
				arr[i]=arr[i]*20;
		}
		System.out.println(  Arrays.toString(arr));
	}
}
/* output

C:\java qs>java Evenreplacement.java
[20, 20, 60, 60, 180, 260, 100]


C:\java qs>java Evenreplacement.java
[20, 20, 60, 60, 180, 260, 100, 80, 100, 20, 20]


*/