public class Carro extends Veiculo {
    double Km;

    Carro(String nome, double preco, double KM) {
        super(nome, preco);

        this.Km = KM;
    }

    public void setKm(int KM) {
        this.Km = KM;
    }

    public double getPreco() {
        if (this.Km >= 100000) {
            this.preco = (preco * 0.08) - preco;
        }
        return preco;

    }
}