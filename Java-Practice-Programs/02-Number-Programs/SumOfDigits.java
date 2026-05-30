import java.util.Scanner;
class Palindrome {
	 static Scanner sc=new Scanner(System.in);
	 static int Palindrome(int n)
     {
         int rev = 0;
        while (n > 0) {
            int ld = n % 10;//get the last digit
            rev= rev*10+ld ;// add the last digit snd sum 
            n = n / 10;// remove the last digit
        
       
      System.out.println("The Reverse is "+rev);
     }return rev;
    }
    public static void main(String[] args) {
       

        System.out.print("Enter a digit:");
        int n =sc.nextInt();
        System.out.println(palindrome());
       

    }
}

/* output 
PS C:\Users\Bharath.S\OneDrive\Desktop\number program java> java Reversenumber.java
Enter a digit:1258
The Reverse is 8521
*/