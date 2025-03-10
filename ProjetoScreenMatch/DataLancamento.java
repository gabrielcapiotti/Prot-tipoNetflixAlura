package ProjetoScreenMatch;

public class DataLancamento {
    private int dia, mes, ano;

    public DataLancamento(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
