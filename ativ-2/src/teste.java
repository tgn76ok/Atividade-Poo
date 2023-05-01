import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class teste {
    public static void main(String[] args) {
        ArrayList<Employee> lista = new ArrayList<Employee>();
        double totalPayroll = 0;

        lista.add(new Salaried("thiago", 2.0));
        lista.add(new Salaried("gabriel", 1.0));

        System.out.println("Lista de empregados ordenada por pagamento (crescente):");
        Collections.sort(lista, Comparator.comparingDouble(Employee::getPay));
        for (Employee employee : lista) {
            System.out.println(employee.getNome() + " - " + employee.getPay());
            totalPayroll += employee.getPay();
        }

        System.out.println("Lista de empregados ordenada por pagamento (decrescente):");
        Collections.sort(lista, Comparator.comparingDouble(Employee::getPay).reversed());
        for (Employee employee : lista) {
            System.out.println(employee.getNome() + " - " + employee.getPay());
        }

        System.out.println("Gasto total da empresa com a folha salarial: " + totalPayroll);
    }
}
