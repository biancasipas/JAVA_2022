package estudar02;
public class objetoCirculo {
    private int x1;
    private int y1;
    private double raio;
    //vou fazer agora presta atençai
    public objetoCirculo() {
        //construtor PADRAO
    }
    public objetoCirculo(int x1, int y, double raio) {
        //construtor2
        this.x1 = x1;
        this.y1 = y;
        this.raio = raio;
    }
    public int getX() {
        return x1;
    }
    public void setX(int x1) {
        this.x1 = x1;
    }
    public int getY() {
        return y1;
    }
    public void setY(int y) {
        this.y1 = y;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double area(double raio) {
        return Math.PI*Math.pow(raio,2);
    }
    //METODO DE MOVER O CIRCULO;
    //VAMOS MUDAR VALOR DE X E Y;
    public void moveX(int x2) {
        this.x1+=x2;

    }
    public void moveY(int y2) {
        this.y1+=y2;//acrescentar
        //mesma coisa de 
        //this.y1 = this.y1 + y2;
    }
    //coloquei x1 e y1
    // é a posiçao do circulo (x.y)

    //AUMENTAR O RAIO DO CIRCULO
    public void aumentaRaio(int aumentar) {
        this.raio = raio;

        }


    //TEMOS QUE CRIAR O METODO DE IMPRIMIR


    public String toString() {//<------ isso aqui
        return "coordenada: ("
                +this.x1 
                +", "
                +this.y1
                +")\n"
                +"Área: "
                +Math.PI*Math.pow(this.raio,2);
    }
    //agora vamos pro outro programa


}