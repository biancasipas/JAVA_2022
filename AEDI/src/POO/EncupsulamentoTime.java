public class EncupsulamentoTime {
    private int horas;
    private int minutos;
    private int segundos;

    public void setTime(int horas,int minutos, int segundos) {
        if ((horas >= 0) && (horas <= 24)) ;
        this.horas = horas;
        if ((minutos >= 0) && (minutos <=59)) ;
        this.minutos = minutos;
        if ((segundos >= 0) && (segundos <=59)) ;
        this.segundos = segundos;

        if(this.minutos > 60){
            this.horas =  horas + 1;
            this.minutos = minutos - 60;
        }
        if (this.segundos > 60) {
            this.minutos = minutos + 1;
            this.segundos = segundos - 60;
        }
        if (this.horas > 60){
            int dia = 1;
            this.horas = horas - 60;
            System.out.println("Dias: "+dia);
        }
        }

            public EncupsulamentoTime() {
                this(0, 0, 0);
            }

            public EncupsulamentoTime(int horas) {
                this(horas, 0, 0);
            }

            public EncupsulamentoTime(int horas, int minutos) {
                this(horas, minutos, 0);
            }

            public EncupsulamentoTime(int horas, int minutos, int segundos) {
                setTime(horas, minutos, segundos);
            }
            public String exibe02(){
                return horas+ ":" + minutos + ":" + segundos;
            }

        }

