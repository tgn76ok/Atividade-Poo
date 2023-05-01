public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String mostraData() {
        String mensagem1 = (this.mes < 10) ? "0" + this.mes : this.mes + "";
        String mensagem2 = (this.dia < 10) ? "0" + this.dia : this.dia + "";

        return mensagem2 + "/" + mensagem1 + "/" + this.ano;
    }

}
