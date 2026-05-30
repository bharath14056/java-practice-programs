
import java.util.Scanner;

class Learningthrow {
    static Scanner sc=new Scanner(System.in); 
        public static void main(String[] args) 
        {

            System.out.println("start");
            System.out.print("enter your age :");
            int age=sc.nextInt();

            if(age>=21){
                System.out.println("Your eligilbe bike ride");

            }
            else{
                throw new IllegalArgumentException("your not eligible for bike ride");
            }
       
    }
}