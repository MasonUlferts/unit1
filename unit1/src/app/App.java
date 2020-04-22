package app;

public class App {
    public static void main(String[] args) throws Exception {
  
     System.out.println("start first loop");

     for (int i = 0; i < 20; i++){
         System.out.println(i);
        if (i == 10){
            for (int j = 0; j < 5; j++){
                System.out.println(i);
            }
        }
    }   
                
               System.out.println("end first loop");
               System.out.println("start second loop");
               for (int i = 0; i < 20; i = i + 2){
                   if (i % 3 == 0){
                       i = i - 1;
                    }
                    System.out.println(i);
               }
            
        }
     }
       
        
        
    

