class Vechicle
{
	String name;
	String Variant;
	int price;
	
	void Vechicle(){//constrouctor
		System.out.println(name);
		System.out.println(Variant);
		System.out.println(price);
		
	}
}
class Bike extends Vechicle
{
	String model;
	int emi;
	void Bike(){
		System.out.println(model);
		System.out.println(emi);
	}
	
}


class Upcasting 
{
	public static void main(String[] args) 
	{
	Vechicle v1=new Vechicle();
	v1.Vechicle();
	
	Bike b1=new Bike ();
	b1.Bike();
	
	System.out.println("___________________________");
		Vechicle v2=new Bike();//upcasting
	v1.Vechicle();
	// v1.Bike(); not possible
	Bike b2=new Bike ();
	b1.Bike();
	
	}
}
/* output 

C:\java qs>java Upcasting.java
null
null
0
null
0
________________________________
null
null
0
null
0
*/