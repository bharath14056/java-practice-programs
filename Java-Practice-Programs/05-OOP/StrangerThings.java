class Strangerthings 
{
	String name;
	int age;
     int episode;
	int season;
	char gender;
	String power;
	
	Strangerthings(String sname,int stages,int parts,int ep,char g,String p){// The parameterised Constructor 
		name=sname;
		age=stages;
		episode=parts;
		season=ep;
		gender=g;
		power=p;
		
	}
	void  display(){
		System.out.println("The Character name is:"+name);
		System.out.println("The Age is :"+age);
		System.out.println("The Epsoide Number is :"+episode);
		System.out.println("The Season:"+season);
		System.out.println("The Gender is:"+gender);
		System.out.println("The power is "+power);
		
	}

	public static void main(String[] args) 
	{
		Strangerthings s1=new Strangerthings("Demon",21,1,01,'M',"Thousand death");
		s1.display();
		Strangerthings s2=new Strangerthings("Devil",25,2,02,'M'," death");
		s2.display();
	}
}
/* output 

C:\java qs>java Strangerthings.java
The Character name is:Demon
The Age is :21
The Epsoide Number is :1
The Season:1
The Gender is:M
The power is Thousand death
The Character name is:Devil
The Age is :25
The Epsoide Number is :2
The Season:2
The Gender is:M
The power is  death
*/
