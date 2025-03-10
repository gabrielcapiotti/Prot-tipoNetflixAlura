package ProjetoScreenMatch.Modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    // ✅ Construtor para inicializar os valores corretamente
    public Serie(String nome, int anoDeLancamento, int temporadas, int episodiosPorTemporada, int minutosPorEpisodio) {
        super(nome, anoDeLancamento); 
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
        this.ativa = true; // Padrão: a série começa ativa
    }

    // Getter e Setter para temporadas
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        if (temporadas > 0) {
            this.temporadas = temporadas;
        } else {
            System.out.println("Erro: O número de temporadas deve ser positivo.");
        }
    }

    // Getter e Setter para status da série (ativa ou não)
    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    // Getter e Setter para episódios por temporada
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        if (episodiosPorTemporada > 0) {
            this.episodiosPorTemporada = episodiosPorTemporada;
        } else {
            System.out.println("Erro: O número de episódios por temporada deve ser positivo.");
        }
    }

    // Getter e Setter para minutos por episódio
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        if (minutosPorEpisodio > 0) {
            this.minutosPorEpisodio = minutosPorEpisodio;
        } else {
            System.out.println("Erro: A duração do episódio deve ser positiva.");
        }
    }

    // Método herdado para calcular duração total da série
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
