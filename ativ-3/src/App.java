import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        while (true) {
            String name = "";
            double rodagem = 0;
            int ano = 0;

            System.out.println("----------------");

            System.out.println("Qual o tipo de empregado:");
            System.out.println(" 1-Carro");
            System.out.println(" 2-Moto");
            System.out.println(" 3-Exibir lista");
            System.out.print(">>>");
            int alternativa = entrada.nextInt();

            if (alternativa == 1) {
                System.out.println("Digite o modelo do carro? ");
                entrada.nextLine();
                name = entrada.nextLine();

                System.out.println("Digite a kilometragem do Carro?");
                rodagem = entrada.nextDouble();

                System.out.println("Digite o preço do Carro?");
                double preco = entrada.nextDouble();

                lista.add(new Carro(name, preco, rodagem));

            } else if (alternativa == 2) {
                System.out.println("Digite o modelo da moto? ");
                entrada.nextLine();
                name = entrada.nextLine();

                System.out.println("Digite o preço da Moto?");
                double preco = entrada.nextDouble();

                System.out.println("Quantas horas voce trabalha");
                ano = entrada.nextInt();

                lista.add(new Moto(name, preco, ano));
            } else if (alternativa == 3) {

                if (!(lista.isEmpty())) {
                    double totalPago = 0;
                    System.out.println("\nLista dos veiculos ordenada por preço (crescente):\n");
                    Collections.sort(lista, Comparator.comparingDouble(Veiculo::getPreco));
                    for (Veiculo Veiculo : lista) {
                        System.out.println(
                                "O Nome do Modelo:" + Veiculo.getModelo() + "| custo " + Veiculo.getPreco());
                        totalPago += Veiculo.getPreco();
                    }

                    System.out.println("Gasto total da empresa com a folha salarial: " + totalPago);
                } else {

                    System.out.println("Nao tem empregados");
                }
            } else {
                break;
            }
        }

    }
}
