public class c15ex01 {
	public static void main(String[] args) {   
		c15ex01A p0 = new c15ex01A("Audi A3", "Branco", "ADFRT45", 2, 250.000);

    System.out.println("Cor de carro: " + p0.getcor());
    System.out.println("Tipo de carro: " + p0.gettipo()); 
    System.out.println("Placa do carro: "+p0.getplaca());
    System.out.println("Número do carro: "+p0.getnum_porta());
    System.out.println("O preço de carro: "+p0.getpreco());
	
}}