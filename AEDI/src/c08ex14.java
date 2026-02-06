
import javax.swing.JOptionPane;
public class c08ex14 {
	public static void main(String[] args) {
	//Programadora Bianca Maria
	String frase,vertical,horizontal,caracter;
	vertical = JOptionPane.showInputDialog(null,
	"Matriz X:",
	"Símbolo",
	JOptionPane.QUESTION_MESSAGE);
	horizontal = JOptionPane.showInputDialog(null,
	"Matriz Z",
	"Símbolo",
	JOptionPane.QUESTION_MESSAGE);
	caracter = JOptionPane.showInputDialog(null,
	"Caractere a ser repetido: ",
	"Símbolo",
	JOptionPane.QUESTION_MESSAGE);
	int vertical1 = Integer.valueOf(vertical).intValue();
	int horizontal1 = Integer.valueOf(horizontal).intValue();
	for(int aux = 0; aux < vertical1; aux++){
        for(int j = 0; j < horizontal1; j++){
            System.out.print(caracter);
           }
           System.out.println();
       }
	}
}