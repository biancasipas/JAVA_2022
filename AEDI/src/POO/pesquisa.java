import java.util.Random;

public class pesquisa {
    private int nDados;
    private boolean ordenado;
    private int dados[];
    public  pesquisa (int nDados,boolean ordenado){
this.nDados = nDados;
this.ordenado = ordenado;
dados = new int [nDados];
if(ordenado){
    for (int i =0; i < nDados; i ++)
        dados[i] = i + 20;
}else{
    Random r =new Random();
    for(int i = 0; i < nDados; i++)
        dados[1] = r.nextInt() % 100;
}
    }
    public void novosDados(int nDados,boolean ordenado){+

    }
}
