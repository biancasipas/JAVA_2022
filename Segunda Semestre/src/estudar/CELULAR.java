package estudar;

public class CELULAR {

	// IPHONE 13
	private String marcar;
	private String cor;
	private String ideal;
	private int numero_camera;
	private double preco;

	public CELULAR(String cor, String marcar, String ideal, int numero_camera, double preco) {
		// TODO Auto-generated constructor stub
	}

	public CELULAR() {
		// TODO Auto-generated constructor stub
	}

	void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	void setMarcar(String marcar) {
		this.marcar = marcar;
	}

	public String getMarcar() {
		return marcar;
	}

	void setIdeal(String ideal) {
		this.ideal = ideal;
	}

	public String getIdeal() {
		return ideal;
	}

	void setNumero_camera(int numero_camera) {
		this.numero_camera = numero_camera;
	}

	public int getNumero_camera() {
		return numero_camera;
	}

	void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
    
}
