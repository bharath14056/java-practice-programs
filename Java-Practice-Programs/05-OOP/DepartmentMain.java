class  Deptartment
{
	public static void main(String[] args) 
	{
		Emp2 e=new Emp2("Dhoni",7,2000);
		/*System.out.println(e.ename);
		e.ename="Natu";
		System.out.println(e.ename);
		
		
C:\java qs>java Department.java
Department.java:6: error: ename has private access in Emp2
                System.out.println(e.ename);
                                    ^
Department.java:7: error: ename has private access in Emp2
                e.ename="Natu";
                 ^
Department.java:8: error: ename has private access in Emp2
                System.out.println(e.ename);
                                    ^
3 errors
error: compilation failed
*/
		
		System.out.println(e.getEname());
		System.out.println(e.getEid());
		System.out.println(e.getSalary());
		
		
		e.setEname("jaddu");
	  System.out.println(e.getEname());
	  e.setEid(8);
	  System.out.println(e.getEid());
	  e.setSalary(42000);
	 System.out.println(e.getSalary());
	}
}
