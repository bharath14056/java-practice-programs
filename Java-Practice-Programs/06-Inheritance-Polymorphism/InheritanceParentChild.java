class Parent
{String bike;
	int money;

	Parent(String bike,int money){
		super();
		System.out.println("Am parent ");
		
		this.bike=bike;
		this.money=money;
	}
}
class Child extends Parent
{	String phono;
	
	Child(String bike,int money ,String phono){
		super(bike,money);
		System.out.println("am child ");
	}
}


class Main
{
	public static void main(String[] args) 
	{
	//	Parent p1=new Parent(gt,40000);
  //System.out.println(p1.bike);// not possible to acess
		Child c1=new Child("ft",78,"Samsung");
		System.out.println(c1.phono);
		System.out.println(c1.money);
		System.out.println(c1.bike);
		Child c2=new Child("gt",40,"Iphone");
		
		
	}
}
/*output 

C:\java qs>java Main.java
Am parent
am child
null
78
ft
Am parent
am child
*/