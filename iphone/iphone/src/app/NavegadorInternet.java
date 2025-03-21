package app;

import util.Conexao;

public class NavegadorInternet extends Conexao {

    public void exibirPagina(String url) {

        conectar();
        System.out.println("Abrindo página: " + url);
        adicionarNovaAba();
        atualizarPagina();

    }

    public void conectar() {
        System.out.println("Contectado à rede internet");
    }

    private void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    private void atualizarPagina() {
        System.out.println("Atualizando nova página");
    }


}
