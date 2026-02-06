import java.util.Scanner;
 public class Studyingandrecord {
	public static void main(String[] args) {
		String pauloOnde, pauloMora, pauloMae ;
		int pauloAnos ;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Paulo,onde você está ?");
		pauloOnde = teclado.nextLine();
		System.out.print("Paulo, onde você morar ?");
		pauloMora = teclado.nextLine();
		System.out.print("Paulo,você tem mãe ?");
		pauloMae = teclado.nextLine();
		System.out.print("Paulo,quanto anos voce tem ?");
		pauloAnos = teclado.nextInt();
		System.out.print(pauloOnde+','+pauloMora+ ',' +pauloMae);
		System.out.print("Idade: "+pauloAnos+ "anos");
		teclado.close();
	 }
}
