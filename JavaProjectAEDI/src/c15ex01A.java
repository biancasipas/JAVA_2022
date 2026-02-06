public class c15ex01A{

	// Carro Audi
	private String tipo;
    private String cor;
    private String placa;
    private int num_porta;
    private Double preco;
    
    public c15ex01A(String tipo,String cor,String placa,int num_porta, double preco) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.num_porta = num_porta;
        this.preco = preco;
    }

	public String getcor(){
	  return this.cor;
	}
	public String gettipo() {
		  return this.tipo;
	  }
   public String getplaca() {
	   return this.placa;
   }
   public int getnum_porta() {
	   return this.num_porta;
   }
   public double getpreco() {
	   return this.preco;
   }
   void setCor(String cor) {
	   this.cor = cor;
   }
   void setTipo(String tipo) {
	   this.tipo = tipo;
   }
   void setPlaca(String placa) {
	   this.placa = placa;
   }
   void setnum_porta(int num_porta) {
	   this.num_porta = num_porta;
   }
   void setpreco(double preco) {
	   this.preco = preco;
}}