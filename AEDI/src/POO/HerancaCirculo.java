
    class HerancaCirculo extends HerancaPonto{
    private float raio;
        public HerancaCirculo(int x,int y, float raio){
            super();
            setRaio(raio);
        }

        //essa classe tem herdar, entao o construtor
        // é diferente
    public void setRaio (float raio){
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void moverHarancaCirculo (int dx,int dy){//isso aqui são os valores para mover
        setX(getX() + dx);
        setY(getY() + dy);

    }

        @Override
        public String toString() {
            return super.toString()+///super é para se referir a classe pai/mae
                    "  raio =" + this.raio;

        }
    }