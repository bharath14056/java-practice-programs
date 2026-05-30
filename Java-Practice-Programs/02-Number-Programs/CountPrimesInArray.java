class Countprimearr 
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
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(isprime(arr[i])){
				count++;
			}
	}
	System.out.println(count);
}
	}
	
	/* output
	
	
C:\java qs>java Countprimearr.java
3

C:\java qs>java Countprimearr.java
5

*/

