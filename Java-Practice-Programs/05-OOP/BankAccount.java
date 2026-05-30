class  Test2
{
	private long AccountNumber;
	private  String  Accountholder;
	private double balance;
	
	Test2(long AccountNumber,String  Accountholder, double balance){
this. AccountNumber=AccountNumber;
	 this. Accountholder=Accountholder;
	 this.balance=balance;
	}
	public static void main(String[] args) 
	{
		Test2 e=new Test2(245287252L,"bharath",2200);
		
		System.out.println(Test2());
	}
}
