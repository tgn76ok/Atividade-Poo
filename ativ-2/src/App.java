import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            String name = "";
            double earnings;
            double totalPayroll = 0;

            ArrayList<Employee> lista = new ArrayList<Employee>();
            Scanner entrada = new Scanner(System.in);
            System.out.println("----------------");
            for (Employee employee : lista) {
                System.out.println(";;");
                System.out.println(employee.getNome());
            }

            System.out.println("Qual o tipo de empregado:");
            System.out.println(" 1-Assalariado");
            System.out.println(" 2-Horista");
            System.out.println(" 3-Exibir lista");
            System.out.print(">>>");
            int alternativa = entrada.nextInt();

            if (alternativa == 1) {
                System.out.println("Digite o nome do empregado");
                entrada.nextLine();
                name = entrada.nextLine();
                System.out.println("Digite o salario");
                earnings = entrada.nextDouble();
                System.out.println("nome +" + name + "| salario " + earnings);

                lista.add(new Salaried(name, earnings));

                System.out.println(lista.get(0).getNome());

            } else if (alternativa == 2) {
                System.out.println("Digite o nome do empregado");
                entrada.nextLine();
                name = entrada.nextLine();

                System.out.println("Quanto voce ganha por hora");
                earnings = entrada.nextDouble();

                System.out.println("Quantas horas voce trabalha");
                double hours = entrada.nextDouble();

                lista.add(new Hourly(name, earnings, hours));
            } else if (alternativa == 3) {

                if (!(lista.isEmpty())) {

                    System.out.println("Lista de empregados ordenada por pagamento (crescente):");
                    Collections.sort(lista, Comparator.comparingDouble(Employee::getPay));
                    for (Employee employee : lista) {
                        System.out.println(
                                "O Nome do empregado:" + employee.getNome() + "| Quanto ganha" + employee.getPay());
                        totalPayroll += employee.getPay();
                    }

                    System.out.println("Lista de empregados ordenada por pagamento (decrescente):");
                    Collections.sort(lista, Comparator.comparingDouble(Employee::getPay).reversed());
                    for (Employee employee : lista) {
                        System.out.println(
                                "O Nome do empregado:" + employee.getNome() + "| Quanto ganha" + employee.getPay());
                    }

                    System.out.println("Gasto total da empresa com a folha salarial: " + totalPayroll);
                } else {
                    System.out.println("Nao tem empregados");
                }
            }
        }

    }
}
