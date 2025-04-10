package Entidades;

import Servicos.AparelhoTelefonico;
import Servicos.NavegadorInternet;
import Servicos.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() { System.out.println("Tocando a música no IPhone"); }

    @Override
    public void pausar() {
        System.out.println("Pausando a música no IPhone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(String.format("Selecionando a música %s no IPhone", musica));
    }

    @Override
    public void ligar(String numero) {
        System.out.println(String.format("Ligando para o número %s no IPhone", numero));
    }

    @Override
    public void atender() { System.out.println("Atendendo ligação no IPhone"); }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no IPhone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println(String.format("Exibindo a página %s no IPhone", url));
    }

    @Override
    public void adicionarNovaAba() { System.out.println("Adicionando nova aba no IPhone"); }

    @Override
    public void atualizarPagina() { System.out.println("Atualizando a página no IPhone"); }
}
