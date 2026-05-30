import java.util.Scanner;

class prog26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
		
		System.out.println("Enter your age:");
		byte age=sc.nextByte();
		
		System.out.println("enter your class year");
		short year=sc.nextShort();
		
		System.out.println("enter a roll number:");
		int rollnumber=sc.nextInt();
		
		System.out.println("enter a ph no:");
		long ph=sc.nextLong();
		
		System.out.println("Enter a percentage:");
		float percentage=sc.nextFloat();
		
		System.out.println("enter a your avg marks:");
		double mark=sc.nextDouble();
		
		System.out.println("enter a  grade:");
		char grade = sc.next().charAt(0);

		
		System.out.println("enter a student pass or fail:");
		 String result = sc.next(); 

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your class year is: " + year);
        System.out.println("Your rollnumber is: " + rollnumber);
        System.out.println("Your class year is: " + ph);
        System.out.println("Your class year is: " + percentage);
        System.out.println("Your class year is: " + mark);
        System.out.println("Your class year is: " + grade);
        System.out.println("Your class year is: " + result);
       
    }
}
