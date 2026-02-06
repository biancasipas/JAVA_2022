import java.util.Scanner;
public class naocopiar {
    //cores da bagaça 
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BYELLOW = "\u001B[93m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[97m";

    public static void main (String[]args){
        
        int voto, total=0, cod=0,cand1=0, cand2=0 , cand3=0 , nulo=0;
        String candidato1 = "Fulano",candidato2 = "Ciclano", candidato3="Beltrano";
        Scanner teclado = new Scanner (System.in);
        System.out.print("\033[H\033[2J");

        for (int i=1; i<=10;i++){
            System.out.print(ANSI_WHITE+"Coloque seu voto: ");
            voto = teclado.nextInt();
            switch (voto){
                case 1:
                System.out.print(ANSI_RED+"Candidato Fulano votado \n");
                cand1++;
                break;
                case 2:
                System.out.print(ANSI_BYELLOW+"Candidato Ciclano votado \n");
                cand2++;
                break;
                case 3:
                System.out.print(ANSI_BLUE+"Candidato Beltrano votado \n");
                cand3++;
                break;
                default:
                System.out.print(ANSI_PURPLE+"Voto nulo \n");
                nulo++;
                break;
            };
        }
        //verificador de votos em nulo
        total = cand1+cand2+cand3;
        if (total <nulo){
            System.out.print("Número de votos nulos maior que votos válidos, eleição encerrada \n");
        }
        //verificar vencerdor
        if(cand1 > cand2 && cand1 >cand3){
            System.out.println(candidato1+ " venceu as eleições!");
        }else if (cand2 > cand1 && cand2 >cand3){
            System.out.println(candidato2+ " venceu as eleições!");
        }else if (cand3 > cand1 && cand3 >cand2){
            System.out.println(candidato3+ " venceu as eleições!");
        }

        //verificador de empate
        if ( cand1 == cand2){
            cod = 1;
        } else if ( cand1 == cand3){
            cod = 2;
        } else if (cand2 == cand3) {
            cod = 3;
        } else {
            cod = 0;
        }
        System.out.print("\033[H\033[2J");

        //Lógica do 2° turno
        if (cod > 0 ){
            System.out.println(ANSI_WHITE+"Segundo turno!");
            switch (cod){
                case 1:
                System.out.println(candidato1+" e "+candidato2);
                break;
                case 2:
                System.out.println(candidato1+" e "+candidato3);
                candidato2 = "Beltrano";
                break;
                case 3:
                System.out.println(candidato2+" e "+candidato3);
                candidato1="Ciclano";
                candidato2="Beltrano";
                break;
                default:
            }
            for (int i=1; i<=10;i++){
                System.out.print(ANSI_WHITE+"Coloque seu voto: ");
                voto = teclado.nextInt();
                switch (voto){
                    case 1:
                    System.out.println(ANSI_RED+"Candidato "+candidato1+" votado \n");
                    cand1++;
                    break;
                    case 2:
                    System.out.println(ANSI_BYELLOW+"Candidato "+candidato2+" votado \n");
                    cand2++;
                    break;
                    default:
                    System.out.println(ANSI_PURPLE+"Voto nulo \n");
                    nulo++;
                    break;
                };
            }
            System.out.print("\033[H\033[2J");
            //Resultado das eleições 
            for(int i=1;i<30;i++){
                if(cand1>cand2){
                    System.out.println(candidato1+" venceu as eleições");
                } else if (cand2>cand1){
                    System.out.println(candidato2+" venceu as eleições");
    
                } else {
                    System.out.println("Deu empate, cancela tudo!");
    
                }
            }
            
            
        }
       
    }
    
}