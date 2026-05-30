class fan
{

public static void main (String []args)
{
	//Thala t1=new Thala("Dhoni:");
	Thala t2=Thala.createThala();
	System.out.println(t2);
	Thala t3=Thala.createThala();
	Thala t4=Thala.createThala();
	Thala t5=Thala.createThala();
	System.out.println(t3);
	System.out.println(t4);
	System.out.println(t5);
}
}
/*output
java fan.java
I am  Thala
Thala@212bf671
Thala@212bf671
Thala@212bf671
Thala@212bf671
*/