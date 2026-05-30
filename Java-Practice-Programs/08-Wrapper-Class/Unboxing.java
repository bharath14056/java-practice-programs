public class Unboxing {
    public static void main(String args[]){
        Integer obj=Integer.valueOf(20);
        System.out.println(obj);
        // Unboxing for int
        int a=obj.intValue();
        System.out.println(a);

        Byte obj2=Byte.valueOf((byte)20);
        System.out.println(obj2);
        // Unboxing for byte
        byte b=obj2.byteValue();
        System.out.println(b);
    }
}

// output:
/*PS C:\Users\Bharath.S\Desktop\Exception-Handling\Wrraper_class> java Unboxing.java
20
20
20
20
20
 */
