public class Salaried extends Employee {
    double salary;

    Salaried(String nome, double salary) {
        this.nome = nome;
        this.salary = salary;

    }

    public double getPay() {
        return salary;
    }

}
