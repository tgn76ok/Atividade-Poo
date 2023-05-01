import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        FabricaLampada lampada1 = new FabricaLampada();

        Scanner entrada = new Scanner(System.in);
        System.out.println(" 1-Incandescente");
        System.out.println(" 2-Fluorescente");
        int alternativa = entrada.nextInt();

        lampada lampada2 = lampada1.contruir(alternativa);
        lampada2.ligar();

    }
}
