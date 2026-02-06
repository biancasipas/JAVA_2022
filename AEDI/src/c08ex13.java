
import java.util.Scanner;
public class c08ex13 {
	public static void main (String[] args) {
	// Programadora Bianca Maria Fernandes Alves
	//O IBGE está fazendo um estudo em cima de todas as 5 cidades de Minas Gerais
	Scanner arquivo = new Scanner(E01825C.class.getResourceAsStream("c08ex13.txt"));
	for(int aux=1; aux <=5; aux++) {
	String nome_cidade = arquivo.nextLine();
	int populacao = arquivo.nextInt();
	int eleitores = arquivo.nextInt();
	int homens = arquivo.nextInt();
	int mulheres = arquivo.nextInt();

		
	int percentual_eleitores = (eleitores*100)/populacao;
	System.out.println("A porcentagem de eleitores é: "+percentual_eleitores+"%");
	int populacaomenor=0;
	String menor_nome = null;
	if (populacao<populacaomenor){
        populacaomenor = populacao;
        menor_nome = nome_cidade;
	}
	int mais_mulheres=0;
	if(mulheres>homens){
        mais_mulheres ++;
	}
	int milhao=0;
	if(populacao>1000000){
        milhao ++;
	}
	System.out.println(" Cidades com mais de um milhão de Habitantes: "+milhao);
    System.out.println(" Cidades com mais de uma cidade com mais mulheres: "+mais_mulheres);
    System.out.println(" Cidade com menor número de habitantes: "+menor_nome);

	}

}
}
