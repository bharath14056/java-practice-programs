
class Example3 {
    public static void main(String args[]) {

        String s1 = null;

        System.out.println(s1.toUpperCase());

    }
}
/*output
PS C:\Users\Bharath.S\Desktop\Java Projects\Exception-Handling> java Example3.java
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "<local1>" is null
        at Example3.main(Example3.java:7)
PS C:\Users\Bharath.S\Desktop\Java Projects\Exception-Handling>  */