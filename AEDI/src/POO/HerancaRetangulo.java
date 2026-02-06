public class HerancaRetangulo extends HerancaPonto {
    private int alturaX;
    private int larguraY;

    public HerancaRetangulo (){

    }
    public void MoverRetangulo (int dx, int dy){
        setX(getX() + dx);
        setY(getY() + dy);

    }

    public HerancaRetangulo (int alturaX, int larguraY){
        this.alturaX = alturaX;
        this.larguraY = larguraY;
    }
    public String toString (){
    return super.toString()+ " Retangulo esquerdo mais altura (eixo y)  : " +larguraY+ "/n"+" e largura (eixo x): "+alturaX;
    }
}
