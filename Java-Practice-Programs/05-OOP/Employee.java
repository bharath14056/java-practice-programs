class Emp 
{
	String ename;
	int eid;
	String CompanyName="Qspiders";// single line intiliazers line
	void empDetails(){
		System.out.println("The Company Name is :"+CompanyName);
	System.out.println("The Employee Name :"+ename);
	System.out.println("The Employee ID:"+eid);
	
	}
	public static void main(String[] args) 
	{
		Emp e1=new Emp();
		System.out.println("____________________________");
		System.out.println("____________________________");
		e1.ename="Bharath";
		e1.eid=2026;
		e1.empDetails();
		System.out.println("____________________________");
		System.out.println("____________________________");
		Emp e2=new Emp();
		e2.ename="Sasi";
		e2.eid=2026;
		e2.empDetails();
		System.out.println("____________________________");
		System.out.println("____________________________");
	}
}
/* output

C:\java qs>java Emp.java
____________________________
____________________________
The Employee Name :Bharath
The Employee ID:2026
____________________________
____________________________
The Employee Name :Sasi
The Employee ID:2026
____________________________
____________________________


C:\java qs>java Emp.java
____________________________
____________________________
The Company Name is :Qspiders
The Employee Name :Bharath
The Employee ID:2026
____________________________
____________________________
The Company Name is :Qspiders
The Employee Name :Sasi
The Employee ID:2026
____________________________
____________________________
*/