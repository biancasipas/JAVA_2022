
public class c14ex02A {
 public static double Quadrado(double lado) {
	 double getLado = lado;
 return (getLado*getLado);
}
 public static double Retangulo(double lado,double altura) {
double getLado = lado;
double getaltura =altura;
return(getLado*getaltura);
 }
 public static double Triangulo(double lado, double altura) {
	 double getLado = lado;
	 double getaltura =altura;
	 return (getLado*getaltura)/2;
 }
 public static double Circulo(double raio) {
	 double getRaio = raio;
	 return(Math.pow(getRaio,2)*Math.PI);
 }
}