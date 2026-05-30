public class Boxing {
    public static void main(String args[]){
        int a=20;
        System.out.println(a);
        // Boxing for int 
        Integer obj=Integer.valueOf(a);
        System.out.println(obj);
        System.out.println(obj.toString());

        // Boxing for byte

        byte b=20;
        System.out.println(b);
        Byte obj2=Byte.valueOf(b);
        System.out.println(obj2);
        }
}


// output:
/*PS C:\Users\Bharath.S\Desktop\Exception-Handling\Wrraper_class> java Boxing.java
20
20
20
20
20
 */

