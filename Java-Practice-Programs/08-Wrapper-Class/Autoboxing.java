public class Autoboxing {
    public static void main(String args[]){
        int a=20;
        System.out.println(a);
        // Autoboxing for int 
        Integer obj=a;
        System.out.println(obj);
        System.out.println(obj.toString());

        // Autoboxing for byte

        byte b=20;
        System.out.println(b);
        Byte obj2=b;
        System.out.println(obj2);
        }
}
// output:
/*PS C:\Users\Bharath.S\Desktop\Exception-Handling\Wrraper_class> java Autoboxing.java
20  
20
20
20
20
 */
