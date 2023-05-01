import java.util.Date;

abstract class Veiculo {
    String modelo;
    double preco;
    Date data = new Date();

    public Veiculo(String nome, double preco) {
        this.modelo = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void insertData() {

        System.out.println("Data Agora: " + data);
    }

    public void printDados() {

    }
}
