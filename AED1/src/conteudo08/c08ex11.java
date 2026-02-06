package conteudo08;

import javax.swing.JOptionPane;
public class c08ex11 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
	String nome,idade,maiscaro,sexo,estado_civil,cor_olhos,cor_cabelos,escolaridade,salario;
	int idade1;
	double salario1,maiorsalario=0,menorsalario=0;
    nome = JOptionPane.showInputDialog(null,"Qual seu nome?", "Informa��o", JOptionPane.INFORMATION_MESSAGE);
    idade = JOptionPane.showInputDialog(null,"Qual sua idade?", "Informa��o", JOptionPane.INFORMATION_MESSAGE);
    sexo = JOptionPane.showInputDialog(null,"Qual seu sexo? 'M' pra masculino ou 'F' para feminio,", "Informa��o", JOptionPane.INFORMATION_MESSAGE);
    estado_civil = JOptionPane.showInputDialog(null,"Qual seu estado civil ? 'C' para casado, 'S' para solteiro ou 'O' para outros ?", "Informa��o", JOptionPane.INFORMATION_MESSAGE);
    cor_olhos = JOptionPane.showInputDialog(null,"Qual seu cor de olho ? 'A' para azul, 'C' para castanhos, 'P' para preto ou 'O' para outros", "Informa��o", JOptionPane.INFORMATION_MESSAGE);
    cor_cabelos = JOptionPane.showInputDialog(null,"Qual seu cor de cabelo? 'L' para loiro, 'P' para preto, 'C' para castanhos ou 'R' para ruivos", "Informa��o", JOptionPane.INFORMATION_MESSAGE);
    escolaridade = JOptionPane.showInputDialog(null,"'1' para analfabeto, '2' para ensino fundamental,'3' para ensino m�dio ou '4'para superior","Informa��o",JOptionPane.INFORMATION_MESSAGE);
    salario = JOptionPane.showInputDialog(null,"Qual � o seu salario :","Informa��o",JOptionPane.INFORMATION_MESSAGE);
    idade1 = Integer.valueOf(idade).intValue();
    salario1 = Double.valueOf(salario).intValue();
    for(int aux=1; aux <=50; aux++) {
    if (sexo.equalsIgnoreCase("F")) {
	} else if (sexo.equalsIgnoreCase("M")) {
	} 
	if (estado_civil.equalsIgnoreCase("C")) {
	} else if (estado_civil.equalsIgnoreCase("S")) {
	} else if (estado_civil.equals("O")) {	
	}
	if (cor_olhos.equalsIgnoreCase("A")) {
	} else if (cor_olhos.equalsIgnoreCase("C")) {
	} else if (cor_olhos.equalsIgnoreCase("P")) {
	} else if (cor_olhos.equalsIgnoreCase("O")) {
	}
			
	if (cor_cabelos.equalsIgnoreCase("L")) {
	} else if (cor_cabelos.equalsIgnoreCase("P")) {
		} else if(cor_cabelos.equalsIgnoreCase("C")) {
		} else if (cor_cabelos.equalsIgnoreCase("R")) {
		}
	if(escolaridade.equalsIgnoreCase("1")) {
	}else if (escolaridade.equalsIgnoreCase("2")) {
	}else if (escolaridade.equalsIgnoreCase("3")) {
	}else if (escolaridade.equalsIgnoreCase("4")) {
	
	}
	if (sexo.equalsIgnoreCase("F") && estado_civil.equalsIgnoreCase("S") && cor_olhos.equalsIgnoreCase("A") && cor_cabelos.equalsIgnoreCase("l") &&
			salario1 > 10000 && escolaridade.equalsIgnoreCase("4") && idade1 >=18 && idade1 <=25);	
   
    if (sexo.equalsIgnoreCase("M")) {
    	 if(aux == 1 || salario1<menorsalario) {
    	    	menorsalario = salario1;
    	    	 if (aux == 1||salario1>maiorsalario) {
    	    	    	maiorsalario = salario1;
    	    	    	maiscaro=nome;
    	    	    	menorsalario=salario1;
    } double diferenca_salario = maiorsalario-menorsalario;
    JOptionPane.showMessageDialog(null,
    "Diferen�a entre o maior e menor sal�rio dos homens: "+diferenca_salario,
    "Informa��o",
    JOptionPane.INFORMATION_MESSAGE);
    
    	 }    
    }
    }
    }
	}

    
  
 

	
