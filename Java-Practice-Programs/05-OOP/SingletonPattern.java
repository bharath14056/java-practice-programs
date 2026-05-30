class Thala 
{public static Thala t;
	String name;
	private Thala(){
		System.out.println("I am  Thala ");
		
	}
	
	public static Thala createThala()
		{
		if (t==null){
		
			t=new Thala();
		
		}	return t;
		}
}
