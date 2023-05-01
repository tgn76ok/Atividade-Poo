public class App {
    public static void main(String[] args) throws Exception {
        CadastroPessoas form = new CadastroPessoas();

        Pessoa humano = form.formulario();

        humano.imprimeDados();
        form.cadastraPessoas(humano);
        System.out.println(form.lista.size());
        form.imprimeCadastro();
    }
}
