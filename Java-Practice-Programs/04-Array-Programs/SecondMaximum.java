class Secondmax 
{
	public static void main(String[] args) 
	{ 
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int nums={1,5,8,7,3,4,6,8,-25};
		for (int i=0;i<a.length ;i++ )
		{
			if (nums>max)
			{
				smax=max;
				max=nums;
				
			}
			else if (nums>smax && nums!=max){
				smax=nums;
			}
			
		}
		System.out.print("The Second MAX:"+smax);
	}
}
/* outptut

C:\java qs>java Secondmax.java
The Second MAX:7

C:\java qs>java Secondmax.java
The Second MAX:7

*/
