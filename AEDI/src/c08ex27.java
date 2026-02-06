public class c08ex27 {
    public static void main (String[]args){
     
        int razao = 2;
        for (int aux=1;aux<10;aux++){
            for(int aux1 =0; aux1<=7; aux1++){
                for(int aux2=1;aux2<=Math.pow(razao, aux1);aux2++){
                    System.out.print("*");
                }
                System.out.println();

            }
       
            for( int aux1=6;aux1>=0;aux1--){
                for(int k=1;k<=Math.pow(razao ,aux1);k++){
                    System.out.print("*");
                }
                System.out.println();

            }
           
         }
        
    }
   
}
