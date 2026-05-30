class Result extends Exception{
    Result(String msg){
        super(msg);
    }
}
public class Custom1 {
    public static void School() throws Result{
        int marks=50;
        if (marks>=80) 
            System.out.println("very good");

            
         else 
             throw new Result("very bad ");
        
    }
    public static void main(String[] args) {
         try {
             Custom1();
             
         } catch (Result n) {
            System.out.println(n);
            System.out.println(get.msg);
         }
    }
}
