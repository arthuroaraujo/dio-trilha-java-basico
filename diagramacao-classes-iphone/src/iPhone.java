public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private ReprodutorMusical musicPlayer;
    private AparelhoTelefonico phone;
    private NavegadorInternet browser;

    public iPhone(ReprodutorMusical musicPlayer, AparelhoTelefonico phone, NavegadorInternet browser) {
        this.musicPlayer = musicPlayer;
        this.phone = phone;
        this.browser = browser;
    }

    public void tocarMusica() {
        musicPlayer.tocar();
    }

    public void fazerLigacao(String numero) {
        phone.ligar(numero);
    }

    public void navegarNaInternet(String url) {
        browser.exibirPagina(url);
    }

    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Pausando música.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba de navegador.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página da web.");
    }
}
