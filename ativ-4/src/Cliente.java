public class Cliente extends Pessoa {

    static int codigo;

    public Cliente() {
        codigo++;
    }

    public Cliente(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;

        codigo++;
    }

    public void imprimeDados() {
        System.out.println(
                "ID: " + codigo +
                        "\nNome: " + nome +
                        "\nNascimento: " + nascimento.mostraData());
    }

}
