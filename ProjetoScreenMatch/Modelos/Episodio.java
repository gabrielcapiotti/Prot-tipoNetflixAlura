package ProjetoScreenMatch.Modelos;

import ProjetoScreenMatch.calculos.Classificacao;

public class Episodio implements Classificacao {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    // 🔥 **Correção: Criando o Construtor Correto**
    public Episodio(int numero, String nome, Serie serie) {
        this.numero = numero;
        this.nome = nome;
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void exibirDetalhes() {
        System.out.println("Episódio " + numero + ": " + nome);
        System.out.println("Série: " + serie.getNome());
    }

    @Override
    public int getClassificacao() {
        return (totalVisualizacoes > 100) ? 4 : 2;
    }
}
