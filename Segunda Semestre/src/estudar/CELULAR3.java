package estudar;

public class CELULAR3 {
	public static void main(String[] args) {
		CELULAR p0 = new CELULAR("Apple", "Verde", "Iphone 13 pro",3, 9.500);

		System.out.println("-----CELULAR-----");
		System.out.println("Qual marcar de celular: " + p0.getMarcar());
		System.out.println("Cor de celular: " + p0.getCor());
		System.out.println("Qual é o Iphone ideal para você: " + p0.getIdeal());
		System.out.println("Qual é o número de câmera: " + p0.getNumero_camera());
		System.out.println("Qual é o valor de celular: " + p0.getPreco());

		CELULAR2 celular = new CELULAR2(2022,"Setembro");
		celular.setano(2022);
		celular.setmes("Setembro");
		System.out.println("Que ano começou novo de celular: " + celular.getano());
		System.out.println("Qual mes comecou novo de celular: " + celular.getmes());

	}
}