public class EncupsulamentoTempo {
    private int dia;
    private int mes;
    private int ano;

    //adicione o construtor
    public EncupsulamentoTempo(int dia,int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia (){
        return dia;
    }
    public void setDia(int dia) {
        if ((dia > 0) && (dia <= 31)) dia = dia;
        else dia = 1;
    }
    public int getMes(){
        return mes;
    }
    public void setMes(int mes) {
        if ((mes > 0) && (mes <= 12)) mes = mes;
        else mes = 1;
    }
    public int getAno (){
        return ano;
    }
    public void setAno(int ano){
        if (ano > 0) ano = ano;
        else ano = 1900;
    }
    public String exibe(){
        return dia + "/" + mes + "/" + ano;
}}
