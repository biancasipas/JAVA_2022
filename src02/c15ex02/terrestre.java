package c15ex02;

public class terrestre extends transporte {
		protected int numRodas;
		private String terrestre;
		
		
		public terrestre(int numRodas,int capacidade) {
	        this.capacidade = capacidade;
	        this.numRodas = numRodas;

				}
		public String getterrestre() {
			return this.terrestre;
		}

		public int getnumRodas() {
			return this.numRodas;
		}

		void setterrestre(String terrestre) {
			this.terrestre = terrestre;
		}

		void setnumRodas(int numRodas) {
			this.numRodas = numRodas;
		}

}