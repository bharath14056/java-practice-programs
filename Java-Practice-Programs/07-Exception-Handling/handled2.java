public class handled2 {
    public static void main(String[] args) {
        System.out.println("start");
        int a[]={1,8,2,4,5,7};
        String s1=null;
        try {
            System.out.println(10+5);
            System.out.println(10-5);
            System.out.println(a[8]);
            System.out.println(s1.toUpperCase());
            System.out.println(30/0);
        } catch (Exception e) {
            System.out.println("Exception handeled");
        }
    }
}
/*output
PS C:\Users\Bharath.S\Desktop\Java Projects\Exception-Handling> java handled2.java
start
15
5
Exception handeled
*/ 