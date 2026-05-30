class handled {
    public static void main(String[] args) {
        System.out.println("Start");
         int arr[]={2,8,7,5,4};
         String s=null;
         try{
         System.out.println(30/0);//first abnormal statement
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception 1 is handeled");
        }
        try{

            System.out.println(s.toLowerCase());//second abnormal statementh
        }
        catch(NullPointerException e){
            System.out.println("Exception 2 is handeled");
        }
        try {
            System.out.println(arr[7]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
        
        System.out.println("Exception 3 handeled");}
         System.out.println("end");
    }

}
/*Output
PS C:\Users\Bharath.S\Desktop\Java Projects\Exception-Handling> java handled.java
Start
Exception 1 is handeled
Exception 2 is handeled
Exception 3 handeled
end*/ 