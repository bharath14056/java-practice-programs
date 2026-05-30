class Engine
{
	void engine()
	{
		System.out.println("Engine Start");
	}
}
	
	
	class Musicplayer
	{
		void music()
	{
		System.out.println("Avlukena");
	}
	}
class Car
{
	Engine engine=new Engine();
	Car()
	{
		engine.engine();
	System.out.println("Car Manufactured ");
	
}
}
	class Factory
	{
	public static void main(String[] args) 
	{
     Car c=new Car();
	 Car c1=new Car();
	 Musicplayer player1=new Musicplayer();
		 
	}
}
