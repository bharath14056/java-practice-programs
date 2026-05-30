class Largestprime 
{
	public static boolean isprime(int n)
	{
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
			}
			
		}return true;
	}
		
	public static void main(String[] args) 
	{
		int arr[]={12,45,17,3,13,7,54,13};
		int max=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(isprime(arr[i]))
				
			if(arr[i]>max){
				max=arr[i];
				count++;
				
			}
	}
	System.out.println("The Maximum prime number is "+max);
}
}
/* output

C:\java qs>java Largestprime.java
The Maximum prime number is 37

C:\java qs>java Largestprime.java
The Maximum prime number is 17
*/