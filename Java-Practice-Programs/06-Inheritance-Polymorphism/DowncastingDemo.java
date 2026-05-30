class Person
{
	void Eat()
		{
		System.out.println("I can eat");
       	}
}
class Student extends Person
{
	void Study()
	{
		System.out.println("I can Study");
	}
}

class Downcasting 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.Study();
		s1.Eat();
		Person p1=new Person();
		p1.Eat();
		 // p1.Study(); not possible.
		 System.out.println("------------Upcasting----------");
		  Person p2=new Student();//Upcasting
		  p2.Eat();
		  // p2.Study(); not possible.
		  System.out.println("-----------Downcasting--------");
		  Student s3=(Student)p2;// Downcasting.
		  s3.Eat();
		  s3.Study();
		
	}
}
/* Output
C:\java qs>java Downcasting.java
I can Study
I can eat
I can eat
------------Upcasting----------
I can eat
-----------Downcasting--------
I can eat
I can Study
*/
