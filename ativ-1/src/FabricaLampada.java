public class FabricaLampada {

    public lampada contruir(int ops) {
        if (ops == 1) {
            return new Incandescente();
        } else if (ops == 2) {
            return new Fluorescente();

        } else {
            throw new IllegalArgumentException("Tipo de lâmpada inválido.");

        }

    }

    public class Incandescente implements lampada {
        public void ligar() {
            System.out.println("Lâmpada incandescente ligada.");
        }

        public void desligar() {
            System.out.println("Lâmpada incandescente desligada.");
        }
    }

    public class Fluorescente implements lampada {
        public void ligar() {
            System.out.println("Lâmpada fluorescente ligada.");
        }

        public void desligar() {
            System.out.println("Lâmpada fluorescente desligada.");
        }
    }
}
