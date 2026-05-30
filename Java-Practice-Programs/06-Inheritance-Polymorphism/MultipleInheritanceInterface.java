/*class Father
{
	void responsibility()
		{
			System.out.println("Take care of the Family");
		}
}
class Mother
{
	void care()
	{
		System.out.println("Make proud of the family");
	}
}
class child extends Father,Mother
{
}
C:\java qs>java Multipleinheritance.java
Multipleinheritance.java:15: error: '{' expected
class child extends Father,Mother
                          ^
1 error
error: compilation failed*///not possible

interface Father
{
	void responsibility();
		
			//System.out.println("Take care of the Family"); not possible
		
}
class Mother
{
	void care()
	{
		System.out.println("Make proud family");
	}
}
class child extends Mother implements Father
{
	@Override
		public void responsibility()
	{
		System.out.println("eat reapt");
	}
}

class Multipleinheritance 
{
	public static void main(String[] args) 
	{
		Father c= new child();
		c.responsibility();
	}
}
/* Output

C:\java qs>java Multipleinheritance.java
eat reapt

*/