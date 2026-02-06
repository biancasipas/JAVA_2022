package conteudo10;

import java.util.Scanner;

public class c10ex08 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		// O IBGE est� fazendo um estudo em cima de todas as 5 cidades de Minas Gerais
		Scanner arquivo = new Scanner(c10ex08.class.getResourceAsStream("conteudo10.c10ex08.txt"));
		int contadorcidade = 0, menorpopulacao = 999999999, contadorH = 0, mais_mulheres = 0, populacao, eleitores,
				homens, mulheres;
		String nome_cidade, menorcidade = null;
		double soma = 0, somaH = 0, media, percentual_eleitores;
		do {
			nome_cidade = arquivo.nextLine();
			populacao = arquivo.nextInt();
			eleitores = arquivo.nextInt();
			homens = arquivo.nextInt();
			mulheres = arquivo.nextInt();
			if (!nome_cidade.equalsIgnoreCase("Zimbabue de Minas")) {
				soma += populacao;
				contadorcidade++;
			}

			somaH += homens;
			contadorH++;

			media = somaH / contadorH;

			if (populacao <= menorpopulacao) {
				menorpopulacao = populacao;
				menorcidade = nome_cidade;
			}

			if (mulheres > homens) {
				mais_mulheres++;
			}

			percentual_eleitores = (eleitores * 100) / populacao;

			arquivo.nextLine();
		} while (!nome_cidade.equalsIgnoreCase("Zimbabue de Minas"));
		System.out.println("Total de cidades: " + contadorcidade);
		System.out.println("Popula��o: " + soma);
		System.out.println("Perventual de eleitores: " + percentual_eleitores);
		System.out.println("Cidades com mais mulheres que homens: " + mais_mulheres);
		System.out.println("Cidade com menor popula��a: " + menorcidade);
		System.out.println("M�dia de homens: "+media);
	}
}
