package TrabalhoS;
import java.util.ArrayList;
import java.util.Scanner;
//PROGRAMADORES: VINÍCIUS LIMA 
//PROGRAMADORES: BIANCA MARIA
public class AlunoExecutavel {
	public static void main(String[] args) {
		ArrayList<Aluno> listaAluno = new ArrayList<>();
		Integer resp, matricula, anoEntrada;
		String email, nome, curso, Graduacao, Posgraduacao, semestreInicio;
		Scanner teclado = new Scanner(System.in);
		System.out.print("ESCOLHA  [1]CRIAR ALUNO  [2] ALTERAR [3]EXIBIR [0]SAIR :");
		resp = teclado.nextInt();
		//estrutura de repetiçao para o menu
		while (resp != 0) {
			switch (resp) {

			case 1:// criar
				if (listaAluno.size() > 0) { // if para conferir se ja existe algum aluno para nao interferir nas ações.
					listaAluno.remove(0);
				}
				System.out.println("=========MENU===========");
				
				System.out.println("ESCOLHA A OPÇÃO: ");
				System.out.println("1.Aluno. ");
				System.out.println("2.Aluno de Graduação.");
				System.out.println("3.Aluno de Pos Graduação. ");
				System.out.print("R: ");

				int digite = teclado.nextInt();
				teclado.nextLine();
				switch (digite) {
				case 1:// aluno
					System.out.println("===ALUNO===");
					System.out.print("Qual seu nome: ");
					nome = teclado.nextLine();
					System.out.print("Qual sua matricula: ");
					matricula = teclado.nextInt();
					teclado.nextLine();
					System.out.print("Deseja criar com email? [1] SIM [2]NAO: ");
					resp = teclado.nextInt();
					teclado.nextLine();
					switch (resp) {
					case 1:// com email
						System.out.print("Qual seu email: ");
						email = teclado.nextLine();
						listaAluno.add(new Aluno(nome, matricula, email));// aluno
						break;
					case 2:// sem email
						listaAluno.add(new Aluno(nome, matricula));

					}
					break;
				case 2:// alunoGraduacao
					System.out.println("===ALUNO DE GRADUAÇÃO===");
					System.out.print("Qual seu nome: ");
					nome = teclado.nextLine();
					System.out.print("Qual sua matricula: ");
					matricula = teclado.nextInt();// <=====lendo numero int
					teclado.nextLine();// entendeu? aquele bug nao pode ler String depois de Int tem que coloca r
										// teclado.nextlIne
					System.out.print("Deseja criar com email? [1] SIM [2]NAO: ");
					resp = teclado.nextInt();
					teclado.nextLine();
					switch (resp) {// com ou sem email
					case 1:// com email
						System.out.print("Qual seu email: ");
						email = teclado.nextLine();
						System.out.print("Qual curso de Graduação: ");
						curso = teclado.nextLine();
						System.out.print("Criar com Ano de Entrada? [1] SIM [2] NAO: ");
						resp = teclado.nextInt();
						switch (resp) {// com ou sem ano de entraDa
						case 1:// com ano de entrada
							System.out.print("Digite o ano de entrada: ");
							anoEntrada = teclado.nextInt();
							listaAluno.add(new AlunoDeGraduacao(nome, matricula, email, curso, anoEntrada));
							break;
						case 2:// sem ano de entrada
							listaAluno.add(new AlunoDeGraduacao(nome, matricula, email, curso));
						}

						break;
					case 2:// sem email
						System.out.print("Digite qual curso de Graduação: ");
						curso = teclado.nextLine();
						System.out.print("Criar com Ano de Entrada? [1] SIM [2] NAO: ");
						resp = teclado.nextInt();
						switch (resp) {// com ou sem ano de entraDa
						case 1:// com ano de entrada
							System.out.print("Digite o ano de entrada: ");
							anoEntrada = teclado.nextInt();
							listaAluno.add(new AlunoDeGraduacao(nome, matricula, curso, anoEntrada));
							break;
						case 2:// sem ano de entrada
							listaAluno.add(new AlunoDeGraduacao(nome, matricula, curso));
							break;
						}
					}
					break;
				case 3:
					System.out.println("===ALUNO DE POS GRADUAÇÃO===");
					System.out.print("Qual seu nome: ");
					nome = teclado.nextLine();
					System.out.print("Qual sua matricula: ");
					matricula = teclado.nextInt();
					System.out.print("Deseja criar com email? [1] SIM [2]NAO: ");
					resp = teclado.nextInt();
					teclado.nextLine();
					switch (resp) {// com ou sem email
					case 1:// com email
						System.out.print("Qual seu email: ");
						email = teclado.nextLine();
						System.out.print("Digite sua graduação: ");
						Graduacao = teclado.nextLine();
						System.out.print("Qual curso de Pos Graduação: ");
						Posgraduacao = teclado.nextLine();
						System.out.print("Criar com Inicio de Semestre? [1] SIM [2] NAO: ");
						resp = teclado.nextInt();
						teclado.nextLine();

						switch (resp) {// com ou sem inicio semestre
						case 1:// com inicio semestre
							System.out.print("Digite o inicio do semestre(mm/YYYY): ");
							semestreInicio = teclado.nextLine();
							listaAluno.add(new AlunoDePosGraduacao(nome, matricula, email, Graduacao, Posgraduacao,
									semestreInicio));
							break;
						case 2:// sem inicio semestre //tem que ter um construtor com esses 5 aqui em ordem
							listaAluno.add(new AlunoDePosGraduacao(nome, matricula, email, Graduacao, Posgraduacao));
							break;

						}
						break;
					case 2:// sem email
						System.out.print("Digite qual curso de Graduação: ");
						curso = teclado.nextLine();
						System.out.print("Digite o curso de Pos Graduação: ");
						Posgraduacao = teclado.nextLine();
						System.out.print("Criar com início do semestre? [1] SIM [2] NAO: ");
						resp = teclado.nextInt();
						teclado.nextLine();
						switch (resp) {// com ou sem inicio do semestre
						case 1:// com inicio do semestre
							System.out.print("Digite o inicio do semestre(mm/YYYY): ");
							semestreInicio = teclado.nextLine();
							listaAluno.add(new AlunoDePosGraduacao(nome, matricula, curso, Posgraduacao, semestreInicio));
							break;
						case 2:// sem ano de entrada
							listaAluno.add(new AlunoDePosGraduacao(nome, matricula, curso, Posgraduacao));
							break;
						}

					}
					break;

					default:
					
					break;
				}
				break;
			case 2:// alterar
				if (listaAluno.size() == 0) {
					System.out.println("Aluno não criado! ");
					break;
				}
				System.out.print(
						"QUAL TIPO DE ALUNO DESEJA ALTERAR:[1] ALUNO [2]ALUNO DE GRADUAÇÃO [3]ALUNO DE POS GRADUAÇÃO \nR) :");
				resp = teclado.nextInt();
				teclado.nextLine();
				switch (resp) {
				case 1:					//retorna o tipo da variavel
					if (listaAluno.get(0).getClass().getSimpleName()!="Aluno") {
						System.out.println("Aluno desse tipo não criado!");
					break;	
						
					}

					System.out.print("O QUE DESEJA ALTERAR : [1]NOME [2]EMAIL: ");
					resp = teclado.nextInt();
					switch (resp) {
					case 1:
						System.out.print("Digite o novo nome: ");
						nome = teclado.nextLine();
						listaAluno.get(0).setNome(nome);

						break;
					case 2:
						System.out.print("Digite o novo email: ");
						email = teclado.nextLine();
						listaAluno.get(0).setEmail(email);
						break;
					}
				case 2:
					if (listaAluno.get(0).getClass().getSimpleName()!="AlunoDeGraduacao") {
						System.out.println("Aluno desse tipo não criado!");
					break;	
						
					}
					
					System.out.print("O que deseja alterar: [1]NOME [2] EMAIL [3] CURSO DE GRADUAÇÃO: \nR: ");
					resp = teclado.nextInt();
					teclado.nextLine();
					switch (resp) {
					case 1:
						System.out.print("Digite o novo nome: ");
						nome = teclado.nextLine();
						listaAluno.get(0).setNome(nome);
						break;
					case 2:
						System.out.print("Digite o novo email: ");
						email = teclado.nextLine();
						listaAluno.get(0).setEmail(email);
						break;
					case 3:
						System.out.print("Digite o novo curso de graduação: ");
						curso = teclado.nextLine();
						((AlunoDeGraduacao) listaAluno.get(0)).setCurso(curso);
						break;

					}
					break;
				case 3:
					if (listaAluno.get(0).getClass().getSimpleName()!="AlunoDePosGraduacao") {
						System.out.println("Aluno desse tipo não criado!");
					break;	
						
					}
					System.out.println("O que deseja alterar: [1]NOME [2] EMAIL [3] POS GRADUAÇÃO \nR: ");
					resp = teclado.nextInt();
					teclado.nextLine();
					switch (resp) {
					case 1:
						System.out.print("Digite o novo nome: ");
						nome = teclado.nextLine();
						listaAluno.get(0).setNome(nome);
						break;
					case 2:
						System.out.print("Digite o novo email: ");
						email = teclado.nextLine();
						listaAluno.get(0).setEmail(email);
						break;
					case 3:
						System.out.print("Digite o pos graduação: ");
						Posgraduacao = teclado.nextLine();
						((AlunoDePosGraduacao) listaAluno.get(0)).setPosgraduacao(Posgraduacao);
						break;
					}

					break;
				}
				break;
			case 3://exibir
				if (listaAluno.size()==0) {
					System.out.println("Aluno ainda não criado!");
				break;	
				}
				System.out.println("=========================INFORMAÇÕES=======================");
				System.out.println(listaAluno.get(0));
				System.out.println("===========================================================");

			}
			System.out.print("ESCOLHA  [1]CRIAR ALUNO  [2] ALTERAR [3]EXIBIR [0]SAIR: \nR: ");
			resp = teclado.nextInt(); // para testar a condição do while.
		}
		teclado.close();
	}
}