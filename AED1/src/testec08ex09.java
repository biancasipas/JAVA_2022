import javax.swing.JOptionPane;
public class testec08ex09 {
	public static void main(String[] args) {
		//Programadora Bianca Maria
	String nome,sexo,idade;
	int idade1;
	int feminino_contador=0,masculino_contador=0, soma2=0, soma1=0;
	double mediaM, mediaF;
	for(int repeticao = 1; repeticao <= 5;repeticao++) {
	nome = JOptionPane.showInputDialog(null,"Qual seu nome: ");
	idade = JOptionPane.showInputDialog(null,"Qual é a sua idade: ");
	idade1 = Integer.valueOf(idade).intValue();
	sexo = JOptionPane.showInputDialog(null,"Sexo(M ou F): ");
	if ("M".equals(sexo)){
		JOptionPane.showMessageDialog(null,"Masculino");
		soma1 += idade1;
		masculino_contador++;
		}else if ("F".equals(sexo)){
		JOptionPane.showMessageDialog(null,"Feminino");
		soma2 += idade1;
		feminino_contador++;
		}
	}
	mediaM = (float) soma1/(masculino_contador);
	mediaF = (float) soma2/(feminino_contador);
	JOptionPane.showMessageDialog(null,
	"Os números dos Masculinos: "+masculino_contador+ "\n"+
	"Os números dos Femininos: "+feminino_contador+"\n"+
	"Média das idades dos homens: "+mediaM+"\n"+
	"Média das idades das mulheres: "+mediaF+"\n",
	"Idade e Sexo",
	JOptionPane.INFORMATION_MESSAGE);
	}
}