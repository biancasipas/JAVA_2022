class AlunoDeGraduacao extends Aluno {


    private String curso;
    private int anoEntrada;


    public int getAnoEntrada() {
        return anoEntrada;
    }

    public void setAnoEntrada(int anoEntrada) {
        anoEntrada = anoEntrada;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }//lembra da ordem
    public AlunoDeGraduacao (String nome,int matricula,String email,String curso){
        super(nome,matricula,email);
        this.curso = curso;    //deixa isso quioeto, deixa sem o curso msm
    }
    public  AlunoDeGraduacao(String nome,int matricula,String email,int anoEntrada){
        super(nome,matricula,email);
        this.anoEntrada = anoEntrada;
    }
    public AlunoDeGraduacao (String nome,int matricula,String email,String curso,int anoEntrada){
        super(nome,matricula,email);
        this.anoEntrada = anoEntrada;
        this.curso = curso;
    }
    public AlunoDeGraduacao (String nome,int matricula,String curso){
        super(nome,matricula);
        this.curso = curso;
    }

    public String toString (){
        return super.toString()+ "Curso: "+curso+ "/n"+ " Que ano entrada: "+anoEntrada;
    }

}
