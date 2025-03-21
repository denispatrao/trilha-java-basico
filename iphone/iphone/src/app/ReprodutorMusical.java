package app;

import util.Conexao;

public class ReprodutorMusical extends Conexao {

    public void selecionarMusica(String musica) {
        conectar();
        System.out.println("Musica selecionada: " + musica);
        tocarMusica();
        pausarMusica();
    }

    private void tocarMusica() {
        System.out.println("Musica tocando...");
    }

    private void pausarMusica() {
        System.out.println("Musica pausada");
    }

    public void conectar() {
        System.out.println("Concectado ao ITunes");
    }

}
