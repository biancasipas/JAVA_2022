public class EncupsulamentoCirculo {
    private double x;
    private double raio;
    private double y;


    public EncupsulamentoCirculo(int x, int y, double raio) {
        //construtor2
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

   public void SetX (double x){
       this.x = x;
    }
    public double getX(){
       return x;
    }
    //Metodo.
    public double area (double raio){
         return Math.PI*Math.pow(raio,2);
    }
    public double perimentro(double raio){
        return 2*Math.PI*raio;
    }
    //METODO DE MOVER O CIRCULO;
    //VAMOS MUDAR VALOR DE X E Y;
    public void moveX(int x1) {
        this.x+=x1;

    }
    public void moveY(int y1) {
        this.y+=y1;
    }
    public void aumentaRaio(int aumentar) {
        this.raio = raio;
    }
    //TEMOS QUE CRIAR O METODO DE IMPRIMIR
    public String exibe03() {
         return   "Centro (x,Y): "+this.x+","+this.y+"/n"+"Raio: "+this.raio+"/n"+"Área: "+Math.PI*Math.pow(this.raio,2);
    }
}
