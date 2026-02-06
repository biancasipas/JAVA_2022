package c15ex02;

public class c15ex02A {
	public static void main(String[] args) {
		transporte carro = new transporte("DFDFDF54","4","Audi","4");
		transporte moto = new transporte("WRSD","2","Audi","1");
		System.out.println("Numero de placa: " + carro.setnumPlaca());
		System.out.println("Número de portas: " + carro.setnumPortas());
		System.out.println("Capacidade: " + carro.setcapacidade());
		System.out.println("Número de rodas: " + carro.setnumRodas());
        
		System.out.println("Numero de placa: " + moto.setnumPlaca());
		System.out.println("Número de portas: " + moto.setnumPortas());
		System.out.println("Capacidade: " + moto.setcapacidade());
		System.out.println("Número de rodas: " + moto.setnumRodas());

}}
