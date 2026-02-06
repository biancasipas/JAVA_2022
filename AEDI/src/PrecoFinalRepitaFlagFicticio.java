import java.util.Scanner; 
public class PrecoFinalRepitaFlagFicticio {
   public static void main(String[] args) {
     double qua, pru, cus, prf = 0, bdi;
     String nome;
     Scanner teclado = new Scanner(System.in);           
     System.out.print("Informe taxa do BDI em %: ");
     bdi = teclado.nextDouble();
     teclado.nextLine();
     do {
       System.out.print("Informe nome do material (FIM para finalizar): ");

         nome = teclado.nextLine();
       if (!nome.equalsIgnoreCase("FIM")) {
          System.out.print("Informe quantidade consumida: ");
          qua = teclado.nextDouble();
          System.out.print("Informe pre�o unit�rio: ");
          pru = teclado.nextDouble();
          teclado.nextLine();
          cus = qua * pru;
          System.out.println("Custo Parcial = " + cus);
          prf += cus;
       }
     } while (!nome.equalsIgnoreCase("FIM"));
     prf += prf * bdi / 100;
     System.out.println("Pre�o Final = " + prf);
     teclado.close();
   }
    //O algoritmo de pesquisa sequencial possui este nome porque objeto
     dele é procurar o elemnto de forma sequncial dentro de uma coleção de elementos.
}