 class trycatch {
    public static void main(String[] args) {
        int a=20,b=0;

        System.out.println("start");
        System.out.println(a+b);

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Your I have handeled");
        }
        System.out.println(a-b);
        System.out.println(a+b);
        System.out.println("End");

    }
}
/*output:
PS C:\Users\Bharath.S\Desktop\Java Projects\Exception-Handling> java trycatch.java
start
20
Your I have handeled
20
20
End */ 
