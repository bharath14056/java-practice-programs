                  public class Example1 {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(10+5);
        System.out.println(5*6);
        System.out.println(7/0);
        System.out.println(8-9);
        System.out.println("Bye");
        
    }
    
}
/* output 
Start
15
30
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Example1.main(Example1.java:6)*/
