
public class areageometrica {
	public static double areaquadrado(double lado) {
		return Math.pow(lado, 2);
	}

	public static double arearetangulo(double base, double altura) {
		return (base * altura);
	}

	public static double areatriangulo(double lado, double altura) {
		return (lado * altura) / 2;
	}

	public static double areacirculo(double raio) {
		return (Math.PI * Math.pow(raio, 2));
	}

}
