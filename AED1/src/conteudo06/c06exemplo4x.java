package conteudo06;

import java.util.Scanner;
public class c06exemplo4x {
   public static void main(String[] args) {
     double salario, inss;
     Scanner teclado = new Scanner(System.in);
     System.out.print("Informe o valor do seu sal�rio: ");
     salario = teclado.nextDouble();
     if (salario <= 300) {
        inss = salario * 0.08;
        System.out.println("Funcion�rio caiu na al�quota de 8%");        
     }
     else {
        inss = salario * 0.1;
        System.out.println("Funcion�rio caiu na al�quota de 10%");                 
     }
     System.out.println("Valor do INSS = "+inss);
     teclado.close();
   }
}
