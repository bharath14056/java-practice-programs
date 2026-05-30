class A{
                 void hello()
                 {
                    System.out.println("Hello");
                 }
               }
               class B extends A{
                void hii(){
                System.out.println("hii");
                }
               }
               class Example4{
                public static void main (String args[])
                {
                    
                 B ob=(B) new A();
                
            }
          }        
          /*Output 
          PS C:\Users\Bharath.S\Desktop\Java Projects\Exception-Handling>  & 'C:\Program Files\Java\jdk-21\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\Bharath.S\AppData\Roaming\Code\User\workspaceStorage\65b2a99e3023afdebe8a98724fbd12b1\redhat.java\jdt_ws\Exception-Handling_cf3f0398\bin' 'Example4' 
          Exception in thread "main" java.lang.ClassCastException: class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
          at Example4.main(Example4.java:16)
          PS C:\Users\Bharath.S\Desktop\Java Projects\Exception-Handling> */ 