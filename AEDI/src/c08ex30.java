import javax.swing.JOptionPane;
public class c08ex30 {
    //Programadora: Bianca Maria
	public static void main(String[] args) {
		
	
	String x,n;
	
	
        double  x1, n1, serie=0, logaritimo, total;
        x=JOptionPane.showInputDialog(null,"Digite um numero: ");
        x1 = Double.valueOf(x);
        n=JOptionPane.showInputDialog(null,"Digite outro numero: ");
        n1 = Double.valueOf(n);
        logaritimo = Math.log(x1);
        for (int aux =2; aux<=n1;aux++){
            serie+=Math.pow(x1, aux)/aux;
        }
        total = logaritimo+x1+serie;
        JOptionPane.showMessageDialog(null,"Total = " + total);
   }
}


        
            
   