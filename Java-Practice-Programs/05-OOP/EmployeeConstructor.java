class Emp1
{
	String ename;
	int age;
	int eid;
     
	
	Emp1(String ename,int age,int eid){// The parameterised Constructor 
		this.ename=ename;
		this.age=age;
		this.eid=eid;
	}
	void  display(){
		System.out.println("The Character name is:"+ename);
		System.out.println("The Age is :"+age);
		System.out.println("The Eid is :"+eid);
		
	}

	public static void main(String[] args) 
	{
		Emp1 s1=new Emp1("Demon",21,01);
		s1.display();
		Emp1 s2=new Emp1("Devil",25,02);
		s2.display();
	}
}
/* output 

C:\java qs>java Emp1.java
The Character name is:Demon
The Age is :21
The Eid is :1
The Character name is:Devil
The Age is :25
The Eid is :2


*/
