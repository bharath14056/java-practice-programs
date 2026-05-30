class Disariumnumbernumber 
{
	public static int power(int b,int p)
	{
		int mul=1;
		for(int i=1;i<=p;i++)
		{
			mul=mul*b;
		}
		return mul;
	}
	public static int count(int n)
	{
		int c=0;
		while(n>0)
		{
			
			n=n/10;
			c++;
		}return c;
	}	
			
	public static void main(String[] args) 
	{
		int n=89;
		 int c=count(n);
		
    		 int temp=n;   
			
	        int sum=0;
		
		while(n>0){
			
			int ld=n%10;
			sum=sum+power(ld,c--);
			
		
		n=n/10;
	}
	if (sum==temp)
	
		System.out.println("It is a Dissarium number:"+sum);
	
	else
		System.out.println("it is not  a Dissarium number:"+sum);
	}
	}


/*
output:

C:\java qs>java Disariumnumber.java
It is a Dissarium number:89

*/
