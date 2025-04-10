import Entidades.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        System.out.println("Reprodutor musical:");

        // Funções de Reprodutor Musical
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Not Afraid");

        System.out.println("===".repeat(18));
        System.out.println("Aparelho Telefônico:");

        // Funções de Aparelho Telefônico
        iPhone.ligar("+55 99 99999-9999");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println("===".repeat(18));
        System.out.println("Navegador de Internet:");

        // Funções de Navegador de Internet
        iPhone.exibirPagina("https://google.com");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
