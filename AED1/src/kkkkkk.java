public class kkkkkk {
    public static void main (String[]args){
     
        int razao = 2;
        //Enquanto i for maior que J , o programa 
        //roda a quantidade de vezes de I fazendo uma linha
        for (int i=1;i<5;i++){
            for(int j =1; j<=i; j++){
                for(int k=1;k<=Math.pow(j,2);k++){
                    System.out.print("*");
                }
            }
           System.out.println("*");
        }
        for (int x=5;x>=1;x--){
            for( int y=1;y<=x;y++){
                for(int k=1;k<=Math.pow(razao ,y);k++){
                    System.out.print("*");
                }
            }
            for (int i=1;i<5;i++){
                for(int j =1; j<=i; j++){
                    for(int k=1;k<=Math.pow(j,2);k++){
                        System.out.print("*");
                    }
                }
               System.out.println("*");
            }
        }
            for (int x=5;x>=1;x--){
                for( int y=1;y<=x;y++){
                    for(int k=1;k<=Math.pow(razao ,y);k++){
                        System.out.print("*");
                    }
                }
            System.out.println("*");
         }
        
    }
   
}
