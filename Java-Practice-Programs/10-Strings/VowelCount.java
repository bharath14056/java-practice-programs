import java.util.Scanner;
class vowles 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter a one letter:");
		char ch=sc.next().charAt(0);
		
		if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U')
		{
			System.out.println("given letter is vowel");
	}
	else
		{
		System.out.println("your letter is consonant");
	}
}
}