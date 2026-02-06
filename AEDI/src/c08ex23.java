public class c08ex23 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
	int soma=0,N1,N2,N3,N4,cont=0;
	for(int aux=1000; aux<=9999 ;aux++) {
	N1 = aux/1000;
	N2 = aux/ 100%10;
	N3 = aux/ 10%10;
	N4 = aux%10;
	if ((N1==N4)&&(N3==N2)) {
		soma += aux;
		cont++;
	}}
	double media = soma/cont;
   System.out.println("Média e:"+media);
}
}

