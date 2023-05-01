public class Funcionario extends Pessoa {
    float salario;

    public float calcularimposto() {
        return salario - (salario * 0.03f);
    }

    public Funcionario(String nome, Data nascimento, float salario) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.salario = salario;

    }

    public void imprimeDados() {
        System.out.println(
                "Nome: " + nome +
                        "\nNascimento: " + nascimento.mostraData() +
                        "\nSalario: " + salario);

    }

}
