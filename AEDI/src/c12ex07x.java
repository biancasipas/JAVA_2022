import javax.swing.JOptionPane;

public class c12ex07x {
	public static void main(String[] args) {
		//Programadora: Bianca Maria Fernades Alves
  int vet[]= new int[3];
  String vetnome[] = new String [vet.length];//length = tamanho do vetor
  String nome,nota;
  for(int aux=0;aux<=vet.length-1;aux++) {
  nome = JOptionPane.showInputDialog(null,
  "Digite seu nome: ",
  "Informação",
  JOptionPane.QUESTION_MESSAGE);
  nota = JOptionPane.showInputDialog(null,
  "Qual é a sua nota: ",
  "Nome do(a)"+nome,
  JOptionPane.QUESTION_MESSAGE);
  vet[aux] = Integer.valueOf(nota).intValue();
  vetnome[aux] = String.valueOf(vetnome);
  if (vet[aux]<=30) {
  JOptionPane.showMessageDialog(null,"Conceito D nome e "+vetnome[aux]);
  }else if(vet[aux]>=31 && vet[aux] <= 60) {
  JOptionPane.showMessageDialog(null,"Conteito C nome e "+vetnome[aux]);
  }else if(vet[aux] >= 61 && vet[aux] <= 80) {
  JOptionPane.showMessageDialog(null,"Conteito B nome e "+ vetnome[aux]);  
  } else {
  JOptionPane.showMessageDialog(null,"Conteito A nome e "+vetnome[aux]);
  }
  System.out.println(vet[aux]);
  }}}
