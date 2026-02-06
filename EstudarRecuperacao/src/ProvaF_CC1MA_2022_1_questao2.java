import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProvaF_CC1MA_2022_1_questao2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<String> listaNomes = new ArrayList<String>();
		List<String> listaHoras = new ArrayList<String>();
		String nome, hora;
		do {
			System.out.print("Digite o nome do professor (FIM para encerrar): ");
			nome = teclado.nextLine();
			if (!nome.equalsIgnoreCase("FIM")) {
				listaNomes.add(nome);
				System.out.print("Digite a hora que ele chegou (HH:MM): ");
				hora = teclado.nextLine();
				listaHoras.add(hora);
			}
		} while (!nome.equalsIgnoreCase("FIM"));
		System.out.print("Informe o nome de um professor para pesquisar na lista: ");
		nome = teclado.nextLine();
		int pos = listaNomes.indexOf(nome);
		if (pos == -1)
			System.out.println("Professor não encontrado!");
		else {
			System.out.println("Professor chegou às " + listaHoras.get(pos) + " hs");
			System.out.println("Na posição " + (pos + 1) + "!");
		}
		teclado.close();
	}
}
