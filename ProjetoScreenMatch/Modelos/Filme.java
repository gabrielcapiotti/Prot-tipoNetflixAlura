package ProjetoScreenMatch.Modelos;
import ProjetoScreenMatch.calculos.Classificacao;


public class Filme extends Titulo implements Classificacao {
    private String diretor;

    // Construtor para inicializar valores ao criar um objeto Filme
    public Filme(String nome, int anoLancamento, String diretor) {
        super(nome, anoLancamento); 
        this.setNome(nome);
    }
    

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
                

    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
