class Addition
{
	Addition(){
		this(100,520,300);// only one this in the one constrouctor 
	System.out.println(40+20);
}
Addition(int a,int b){
	this();
	System.out.println(a+b);
}
Addition(int a,int b,int c){
	/* this();  not possible constrouctor cycle 
C:\java qs>java Calculator1.java
Calculator1.java:8: error: recursive constructor invocation
        this();
        ^
1 error
error: compilation failed
*/
	System.out.println(a+b+c);
}

}
class  Calculator1
{
	public static void main(String[] args) 
	{
		Addition A1=new Addition();
		
	}
}

/* output 

C:\java qs>java Calculator1.java
60

C:\java qs>java Calculator1.java
920
60

C:\java qs>java Calculator1.java
920
60

C:\java qs>java Calculator1.java
Calculator1.java:8: error: recursive constructor invocation
        this();
        ^
1 error
error: compilation failed

C:\java qs>java Calculator1.java
920
60   
*/