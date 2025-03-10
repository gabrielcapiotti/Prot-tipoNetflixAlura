package ProjetoScreenMatch.Principal;

import java.util.ArrayList;
import ProjetoScreenMatch.Modelos.Episodio;
import ProjetoScreenMatch.Modelos.Filme;
import ProjetoScreenMatch.Modelos.Serie;
import ProjetoScreenMatch.calculos.CalculadoraTempo;
import ProjetoScreenMatch.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999, "Lana Wachowski, Lilly Wachowski");
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme("John Wick", 2014, "Chad Stahelski");
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie laCasaDePapel = new Serie("La Casa de Papel", 2017, 5, 10, 45);
        laCasaDePapel.setIncluidoNoPlano(true);
        laCasaDePapel.setAtiva(true);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.adicionarTitulo(favorito);
        calculadora.adicionarTitulo(outro);
        calculadora.adicionarTitulo(laCasaDePapel);

        System.out.println("\n📽️ **Informações dos Títulos**");
        System.out.println("🎬 Filme 1: " + favorito.getNome() + " - Diretor: " + favorito.getDiretor());
        System.out.println("🎬 Filme 2: " + outro.getNome() + " - Diretor: " + outro.getDiretor());
        System.out.println("📺 Série: " + laCasaDePapel.getNome() + " - Temporadas: " + laCasaDePapel.getTemporadas());

        System.out.println("\n⏳ **Tempo total de exibição:** " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        Episodio episodio = new Episodio(1, "Piloto", laCasaDePapel);
        episodio.exibirDetalhes();

        Filme filmeGabriel = new Filme("Solo Leveling", 2023, "Shunsuke Nakashige");
        filmeGabriel.setDuracaoEmMinutos(200);
        filmeGabriel.avalia(10);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(filmeGabriel);
        listaFilmes.add(outro);

        System.out.println("\n📜 **Lista de Filmes:**");
        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Primeiro filme: " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
        System.out.println("toString do filme: " + listaFilmes.get(0).toString());
    }
}
