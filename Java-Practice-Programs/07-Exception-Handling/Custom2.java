class Bike{
  static  boolean isStoppable=false;
    public  static void ride(){
        System.out.println("Bike is riding");
        if(isStoppable){
            System.out.println("Bike can be stopped");
        }        else{
            System.out.println("Bike cannot be stopped");
        }
    }
}
class BreakNotworking extends RuntimeException{
    public BreakNotworking(String message){
        super(message);
    }
}
class Custom2{
    public static void main(String[] args){
        Bike bike = new Bike();
        bike.ride();
            try{
                throw new BreakNotworking("The break is not working");
            }catch(BreakNotworking e){
                System.out.println(e.getMessage());
            }
    }
} 