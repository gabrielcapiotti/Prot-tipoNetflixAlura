package ProjetoScreenMatch.Principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import ProjetoScreenMatch.Modelos.Filme;
import ProjetoScreenMatch.Modelos.Serie;
import ProjetoScreenMatch.Modelos.Titulo;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999, "Lana Wachowski, Lilly Wachowski");
        favorito.setDuracaoEmMinutos(135);

        Filme outro = new Filme("John Wick", 2014, "Chad Stahelski");
        outro.setDuracaoEmMinutos(101);

        Filme filmeGabriel = new Filme("Solo Leveling", 2023, "Shunsuke Nakashige");
        filmeGabriel.setDuracaoEmMinutos(200);

        Serie laCasaDePapel = new Serie("La Casa de Papel", 2017, 5, 10, 45);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeGabriel);
        lista.add(outro);
        lista.add(laCasaDePapel); // Corrigindo o erro de "Lost"

        System.out.println("\n🎞️ **Lista de Títulos**:");
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
        
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Keanu Reeves");
        buscaPorArtista.add("Sung Jin-Woo");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da Ordenação");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));





    }
}
