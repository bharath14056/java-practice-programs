import java.util.Scanner;
class Primemethod
{ 
	static Scanner sc= new Scanner(System.in);
	public static boolean isPrime(int n)
	{
		for (int i=2;i<=n/2 ;i++ )
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main (String[]args){
		System.out.println("Enter a number:");	
		int n=sc.nextInt();
		boolean ans=isPrime( n);
		if (ans)
		{
			System.out.println("It is a prime :"+n);
		}
		else
			System.out.println("It is not a prime:"+n);
	}
}

/* output

C:\java qs>java Primemethod.java
It is not a prime

C:\java qs>java Primemethod.java
It is a prime

C:\java qs>java Primemethod.java
Enter a number:
88
It is not a prime88

C:\java qs>java Primemethod.java
Enter a number:
1112
It is not a prime1112
*/