public class Moto extends Veiculo {
    int ano;

    public Moto(String nome, double preco, int ano) {
        super(nome, preco);
        this.ano = ano;
    }

    public void setAno(int Ano) {
        this.ano = Ano;
    }

    public double getPreco() {
        if (this.ano >= 2008) {
            this.preco = (preco * 0.1) - preco;
        }
        return preco;

    }
}
