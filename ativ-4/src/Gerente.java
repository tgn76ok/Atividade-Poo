public class Gerente extends Funcionario {
    public String area;

    public float calcularimposto() {
        return salario - (salario * 0.05f);
    }

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;

    }

    public void imprimeDados() {
        System.out.println(
                "Nome: " + nome +
                        "\nNascimento: " + nascimento.mostraData() +
                        "\nSalario: " + salario +
                        "\nArea: " + area);

    }
}
