package app;

import util.Conexao;

public class Telefone extends Conexao {

    public void ligar(String numero) {
        conectar();
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Telefone tocando...");
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Telefone não atendido");
        System.out.println("Deixando mensagem na caixa postal...");
    }

    public void conectar() {
        System.out.println("Conectado à rede de telefonia");
    }

}
