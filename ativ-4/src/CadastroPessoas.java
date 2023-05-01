import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoas {
    ArrayList<Pessoa> lista = new ArrayList<>();

    int qtdAtual = 0;

    public void cadastraPessoas(Pessoa individou) {
        if (!((individou.nome.equals("0")) && (individou.nascimento.getAno() == 0)
                && (individou.nascimento.getDia() == 0) && (individou.nascimento.getMes() == 0))) {
            lista.add(individou);
        }
        qtdAtual += 1;
    }

    public Pessoa formulario() {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("____CADASTRO____");
            System.out.println("1. Cliente");
            System.out.println("2. Funcionario");
            System.out.println("3. Gerente");
            System.out.println("4. Exibir as classes");
            System.out.print(">>>>");
            int ops = entrada.nextInt();

            if (ops == 1) {
                System.out.print("Digite o nome: ");
                entrada.nextLine();
                String nome = entrada.nextLine();
                System.out.println("Digite a data: ");
                System.out.print("Dia: ");
                int dia = entrada.nextInt();
                System.out.print("Mes: ");
                int mes = entrada.nextInt();
                System.out.print("Ano: ");
                int ano = entrada.nextInt();

                return new Cliente(nome, new Data(dia, mes, ano));

            } else if (ops == 2) {
                System.out.print("Digite o nome: ");
                entrada.nextLine();
                String nome = entrada.nextLine();
                System.out.println("Digite a data: ");
                System.out.print("Dia: ");
                int dia = entrada.nextInt();
                System.out.print("Mes: ");
                int mes = entrada.nextInt();
                System.out.print("Ano: ");
                int ano = entrada.nextInt();
                System.out.print("Digite o salario: ");
                float salario = entrada.nextInt();

                return new Funcionario(nome, new Data(dia, mes, ano), salario);

            } else if (ops == 3) {
                System.out.print("Digite o nome: ");
                entrada.nextLine();
                String nome = entrada.nextLine();
                System.out.println("Digite a data: ");
                System.out.print("Dia: ");
                int dia = entrada.nextInt();
                System.out.print("Mes: ");
                int mes = entrada.nextInt();
                System.out.print("Ano: ");
                int ano = entrada.nextInt();
                System.out.print("Digite o salario: ");
                float salario = entrada.nextInt();
                System.out.println("Digite a Area:");
                entrada.nextLine();
                String area = entrada.nextLine();

                return new Gerente(nome, new Data(dia, mes, ano), salario, area);

            } else {

                System.out.println("valor invalido");
                return new Funcionario("0", new Data(0, 0, 0), 0);
            }

        }

    }

    public void imprimeCadastro() {
        System.out.println("----------------------");
        for (int i = 0; i <= qtdAtual - 1; i++) {
            System.out.println();
            lista.get(i).imprimeDados();
            System.out.println("#######################");

        }

    }
}
