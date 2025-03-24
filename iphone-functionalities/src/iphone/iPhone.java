package iphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private int armazenamento;

    public iPhone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }
    //aparelho telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void inicioCorreioVoz() {
        System.out.println("Correios de voz iniciado");
    }
    //navegador internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada");
    }
    //reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
