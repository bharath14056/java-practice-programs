import java.util.Scanner;
import java.util.Arrays;

    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{ 
		int a[]={10,40,52,60,70};
		int n=a.length;
			
		System.out.print("Enter a K value:");
		int k=sc.nextInt();
		k=k%n;
		 
		for(int j=1;j<=k;j++){
			int last=a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[0]=last;
     
	}System.out.println(Arrays.toString(a));
	
	}
	
/* output

C:\java qs>java PositionN.java
Enter a K value:30
[10, 40, 52, 60, 70]


C:\java qs>java PositionN.java
Enter a K value:75
[10, 40, 52, 60, 70]

C:\java qs>java PositionN.java
Enter a K value:4
[40, 52, 60, 70, 10]

*/