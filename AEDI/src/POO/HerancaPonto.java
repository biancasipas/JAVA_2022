public class HerancaPonto {//essa é o objeto pai//classe mae

    private int y;

    private int x;

    public HerancaPonto (){

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = (y>0)? y: 0;
    }

    public HerancaPonto(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = (x>0) ? x : 0;
    }

    public int getX() {
        return x;
    }
    public void mover(int dx, int dy){
        setX(x+dx); // x = x + dx;
        setX(y+dy);
    }
    public String toString() {
     return "Centro: (" +this.x+","+this.y+")";
}//agora é só ajustar

}
