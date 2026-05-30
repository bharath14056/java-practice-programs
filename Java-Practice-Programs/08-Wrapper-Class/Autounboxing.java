public class Autounboxing {
    public static void main(String args[]){
        Integer obj=Integer.valueOf(20);
        System.out.println(obj);
        // Autounboxing for int
        int a=obj;
        System.out.println(a);

        Byte obj2=Byte.valueOf((byte)20);
        System.out.println(obj2);
        // Autounboxing for byte
        byte b=obj2;
        System.out.println(b);
    }
}
// output:  
/*PS C:\Users\Bharath.S\Desktop\Exception-Handling\Wrraper_class> java Autounboxing.java
20
20
20
20
20
 */