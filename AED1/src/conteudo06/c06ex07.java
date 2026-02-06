package conteudo06;

import java.util.Scanner;
public class c06ex07 {
	public static void main (String[] args) {
	double salario, valor_fixo, taxa_salario, bruto, imposto,liquido;
	   Scanner teclado = new Scanner(System.in);
	     System.out.print("Qual � o salario: ");
	     salario = teclado.nextDouble();
	     if ( salario <= 300) {
	     valor_fixo = 500;
	     taxa_salario = 0.7;
	     bruto = valor_fixo + (salario*taxa_salario);
	     imposto = 0.25*bruto;
	     liquido = bruto - imposto;
	     }else if ( salario > 300 && salario <= 1000) {
	     valor_fixo = 200;
	     taxa_salario = 0.5;
	     bruto = valor_fixo + (salario*taxa_salario);
	     imposto = 0.25*bruto;
	     liquido = bruto - imposto;
	     }else{
	     valor_fixo = 0;
	     taxa_salario = 0.3;
	     bruto = valor_fixo + (salario*taxa_salario);
	     imposto = 0.25*bruto;
	     liquido = bruto - imposto;
	     }
	     System.out.println("Qual � o valor de sua participa��o nos lucros(PL L�quido): "+liquido);
	     teclado.close();
    }
	}


