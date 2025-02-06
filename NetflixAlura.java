public class NetflixAlura {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        System.out.println("Ano de lançamento:"+anoLancamento);
        boolean incluidoPlano = true;
        double notaFilme = 8.1; 
        double media = (9.8 + 6.3 + 8.0) /3;
        
        String sinopse;
        sinopse = """
                A aventura começa com o Tom Cruise, um jovem de 21 anos que é um veterano de combate aéreo.
                Quando ele é assassinado por um agente do governo, o filme começa a se tornar uma historia de espionagem.
                O Tom Cruise é abordado por um agente secreto que procura o assassino, o que leva a um encontro com um jovem agente chamado Scott Walker, que é um agente de bombeiro.
                Aos poucos, o grupo se tornam amigos e o filme se torna uma trama de espionagem, com um encontro com um crime que o agente do governo está preocupado com.
                """+anoLancamento;
        System.out.println(sinopse);
        System.out.println();
        System.out.println();

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}
