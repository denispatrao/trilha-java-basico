package aparelho;

import app.NavegadorInternet;
import app.ReprodutorMusical;
import app.Telefone;

public class Iphone {

    public static void main(String[] args) {

        System.out.println("----------IPOD---------- ");
        ReprodutorMusical ipod = new ReprodutorMusical();
        ipod.selecionarMusica("audio.mp3");

        System.out.println(" ");
        System.out.println("----------INTERNET----------");
        NavegadorInternet browser = new NavegadorInternet();
        browser.exibirPagina("www.site.com.br");

        System.out.println(" ");
        System.out.println("----------TELEFONE----------");
        System.out.println("Efetuando Ligação");
        Telefone telefone = new Telefone();
        telefone.ligar("(011)11111-1111");

        System.out.println(" ");
        System.out.println("----------TELEFONE----------");
        telefone.iniciarCorreioVoz();

        System.out.println(" ");
        System.out.println("----------TELEFONE----------");
        telefone.atender();

    }
}
