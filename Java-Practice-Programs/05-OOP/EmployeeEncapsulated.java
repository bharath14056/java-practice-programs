class  Emp2
{
       private String ename;
	   private int eid;
	   private double Salary;
        
		Emp2(String ename,int eid,double Salary){
			this.ename=ename;
			this.eid=eid;
			this.Salary=Salary;
			
		}
		// getter method for ename.
		public String getEname(){
			return ename;
		}
		//setter method for ename.
		public void setEname(String ename){
			this.ename=ename;
		}
			
				// getter method for eid.
		public int getEid(){
			return eid;
		}
		//setter method for eid.
		public void setEid(int  eid){
			this.eid=eid;	
		}
			// getter method for salary.
		public double getSalary(){
			return Salary;
		}
		//setter method for Salary.
		public void setSalary(int  Salary){
			this.Salary=Salary;
			
		}
}
