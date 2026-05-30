
class Ducknumber

{
	
	public static boolean  isDuck(int n){
		
		while(n>0)
	{
		int ld=n%10;
		if(ld==0)
			return true;
		n=n/10;
	}
	return false;
	}

	public static void main(String[] args) 
	{
		int n=1254;
		
	boolean ans=isDuck(n);
		if(ans==true)
		System.out.println("it is a ducknumber");
		else
			System.out.println("it is not a duck");
		
		
	}
}

/* output

C:\java qs>java Ducknumber.java
it is a ducknumber

C:\java qs>java Ducknumber.java
it is not a duck
*/
