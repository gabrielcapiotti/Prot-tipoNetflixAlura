package ProjetoScreenMatch.calculos;

import ProjetoScreenMatch.Modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void adicionarTitulo(Titulo t) {
        tempoTotal += t.getDuracaoEmMinutos();
    }

    public void inclui(Titulo titulo) {
        if (titulo != null) {
            System.out.println("Adicionando duração em minutos de " + titulo.getNome());
            this.tempoTotal += titulo.getDuracaoEmMinutos();
        } else {
            System.out.println("Erro: Título inválido.");
        }
    }
}
