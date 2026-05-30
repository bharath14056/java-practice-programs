import java.util.Scanner;

class prog27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
		
		System.out.println("Enter your age:");
		byte age=sc.nextByte();
		
		System.out.println("enter employee id:");
		int id=sc.nextInt();
		
		System.out.println("enter experince :");
		short year =sc.nextShort();
		
		System.out.println("enter salary:");
		double salary=sc.nextDouble();
		
		System.out.println("Enter a bonus percentage:");
		float percentage=sc.nextFloat();
		
		System.out.println("enter a your contact number:");
		long contact_number=sc.nextLong();
		
		System.out.println("enter a  code:");
		char code = sc.next().charAt(0);

		
		System.out.println("enter a permanent or not:");
		 String result = sc.next(); 

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your class year is: " + id);
        System.out.println("Your rollnumber is: " + year);
        System.out.println("Your class year is: " + salary);
        System.out.println("Your class year is: " + percentage);
        System.out.println("Your class year is: " + contact_number);
        System.out.println("Your class year is: " + code);
        System.out.println("Your class year is: " + result);
       
    }
}
