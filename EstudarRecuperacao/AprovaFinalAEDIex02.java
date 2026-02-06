//Bianca Banana Maria Fernandes Alves
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class AprovaFinalAEDIex02 {

	public static void main(String[] args) {
		
		        Scanner teclado = new Scanner(System.in);
		        List<String> professorLista = new ArrayList<>();
		        List<String> listaHoras = new ArrayList<String>();
		        String professor,hora;
		        do {
		            System.out.print("Digite o nome do professor: ");
		            professor = teclado.nextLine();
		          
		            if (!professor.equalsIgnoreCase("FIM")) {
		            	System.out.print("Digite a hora que ele chegou (HH:MM): ");
						hora = teclado.nextLine();
						listaHoras.add(hora);
			            professorLista.add(professor);
		            }
		        } while (!professor.equalsIgnoreCase("FIM"));
		        // b)Nome de um professor qualquer!
		        String nomePesquisar;
		        System.out.println("============== PROCURAR A LISTA PROFESSOR ============== ");
		        System.out.print("Informe o nome do professor: ");
		        nomePesquisar = teclado.nextLine();
		        
		        // c)Pesquisar o nome do professor informado na lista professor ;
		        int pos = -1;
		        for (int aux = 0; aux < professorLista.size(); aux++) {
		            if (professorLista.get(aux).equalsIgnoreCase(nomePesquisar)) {
		                pos = aux;
		                break;          
		                }
		            
		        }
		        if (pos == -1)
		            System.out.println("Professor não encontrado!");
		        else {
		        	System.out.println("Professor chegou às " + listaHoras.get(pos) + " hs");
					System.out.println("Na posição " + (pos + 1) + "!");
		   
		        }

		        teclado.close();
		    } 
		}