
// using super keyword in inheritance
class Rapido
{
	String Pickup;
	String destination;
	int Distance;
	Rapido(String Pickup,String destination,int Distance)
		{
           this. Pickup = Pickup;
          this.destination  = destination;
        this.Distance   = Distance;
	  }
}
class Bike extends Rapido
{
	int Price=10;
	Bike(String Pickup,String destination,int Distance)
		{
		  super( Pickup, destination,Distance);
     	}
		void Totalprice ()
	{
		System.out.println("Your price is Bike  "+(Price*Distance));
	}
}
class Auto  extends Rapido
{
	int AutoPrice=10;
	Auto(String Pickup,String destination,int Distance)
		{
		  super( Pickup, destination,Distance);
     	}
		void Totalprice ()
	{
		System.out.println("Total price for Auto "+(AutoPrice*Distance));
	}
}

class User
{
	public static void main(String[] args) 
	{
		Bike r1=new Bike("Arummbakkam","Vadapalnai",2);
	    r1.Totalprice();
		Auto r2=new Auto("Redhills","MMD colony",18);
		r2.Totalprice();
	}
}

/* output 

C:\java qs>java User.java
Your price is Bike  20
Total price for Auto 180

*/

