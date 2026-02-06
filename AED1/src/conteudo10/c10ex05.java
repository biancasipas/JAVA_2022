package conteudo10;

import javax.swing.JOptionPane;
public class c10ex05 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
	String altura,peso,sexo;
	double altura1,peso1,somaM=0;
	int feminino_contador = 0, masculino_contador = 0,contadorpeso=0,total;
	do {
	altura = JOptionPane.showInputDialog(null,
	"Qual a sua altura: ",
	"Informa��o",
	JOptionPane.INFORMATION_MESSAGE);
	altura1 = Double.valueOf(altura).doubleValue();
	if (altura1!=0) {
	peso = JOptionPane.showInputDialog(null,
	"Qual � o seu peso :",
	"Informa��o",
	JOptionPane.INFORMATION_MESSAGE);
	sexo = JOptionPane.showInputDialog(null,
	"Qual seu sexo (F ou M) ",
	"Informa��o",
	JOptionPane.INFORMATION_MESSAGE);
	peso1 = Double.valueOf(peso).doubleValue();
	if (sexo.equalsIgnoreCase("M")) {
		JOptionPane.showMessageDialog(null, "Masculino");
		somaM+=altura1;
		masculino_contador++;
	} else if (sexo.equalsIgnoreCase("F")) {
		JOptionPane.showMessageDialog(null, "Feminino");
		feminino_contador++;
    if (peso1 <= 60) {
     contadorpeso++;
    }
	}}}while (altura1!=0);
	total = feminino_contador + masculino_contador;
	double media = somaM/masculino_contador;
	JOptionPane.showMessageDialog(null,
    "Quantidade de pessoas pesquisadas: "+total+ "\n"+ "Quantidade de mulheres: "+feminino_contador+ "\n"+
	"Altura m�dia dos homens: "+media+ "\n"+ "Quantidade de mulheres com peso menor que 60: "+contadorpeso,
	"Informa��o",
	JOptionPane.INFORMATION_MESSAGE);

	}
	}


