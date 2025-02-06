public class Condicional {
    public static void main(String[] args) {
        
        int anoLancamento = 2022;
        boolean incluidoPlano = false;
        double notaFilme = 8.1; 
        String tipoPlano = "plus";

        if (anoLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
            
        } else {
            System.out.println("Filme retrô que vale a pena assistir.");
        }

        if (incluidoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado.");
            
        } else {
            System.out.println("Deve pagar a locação.");
        }

    }
}
