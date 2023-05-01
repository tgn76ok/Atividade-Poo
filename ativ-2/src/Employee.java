import java.util.Date;

abstract class Employee {
    String nome;

    public void Employee(String nome) {
        this.nome = nome;
    }

    public void insertData() {
        Date data = new Date();
        System.out.println("Data Agora: " + data);
    }

    public abstract double getPay();

    public String getNome() {
        return nome;
    }

    public void printPay() {
        System.out.println("dinhero ganho");

    }
}