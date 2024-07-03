public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public void iPhone(String modelo) {
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void stop() {
        System.out.println("Música parada.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void terminarChamada() {
        System.out.println("Chamada terminada.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}

