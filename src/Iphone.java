import aparelho.funcoes.AparelhoTelefonico;
import aparelho.funcoes.NavegadorInternet;
import aparelho.funcoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero : " + numero);
    }

    @Override
    public void atender(String numero) {

        System.out.println("Atendendo o numero : " + numero);

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Por favor deixe sua mensagem:");

    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println(pagina);

    }

    @Override
    public void adicionarNovaAba(String novaPagina) {
        System.out.println(novaPagina);

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando...");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a musica " + musica);
    }

    @Override
    public void pausar(String musica) {
        System.out.println("Pausando a musica " + musica);
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada");
    }


    public static void main(String[] args) {
        iniciarCorreioVoz();

    }

}





