package TrabalhoS;
public class Aluno {
    private String nome;
    private int matricula;
    private String email;

    public Aluno(String nome, int matricula) {
        if (nome == null) {
            this.nome = "Zé Mané";
        } else {
            this.nome = (nome != null) ? nome : "Zé Mané";
        }
        this.nome = nome;
        this.matricula = (matricula > 999999) ? matricula : 9999999;

    }

    public Aluno(String nome, int matricula, String email) {
        this.nome = (nome != null) ? nome : "Zé Mané"; //if matricula > 99999999{} =//é igual a isso (matricula > 999999) ?
        this.matricula = (matricula > 999999) ? matricula : 9999999;//() <-se ? <-entao : <-senao
        this.email = (validaEmail(email) == 1) ? email : null;
    }  //kd o metodo?

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = (matricula > 999999) ? matricula : 9999999;
    }

    public void setNome(String nome) {
        this.nome = (nome != null) ? nome : "Zé Mané"; 
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int validaEmail(String email) {
        if (email.indexOf("@") != -1) { //pq != ??? pq se der -1 ele nao acha, se der 1 significa que achou//entendeu?ssimm
            String vetorConfere[] = email.split("@"); //???? <-----
            if (vetorConfere.length > 1) {
                if (vetorConfere[0].length() >= 1 && vetorConfere[1].length() >= 1) {
                    return 1;
                } else
                    return -1; //e agora ?vamos melhorar aqui rapidao, okkk//se o ususario nao digitar com @ entao nao
                //tem como dar split
            } else
                return -1;
        } else return -1;

    }
    public String toString() {
        return "Nome: "+nome+"\nMatricula: "+matricula+ "\n"+ " Email: "+email+"\n";
    }}
