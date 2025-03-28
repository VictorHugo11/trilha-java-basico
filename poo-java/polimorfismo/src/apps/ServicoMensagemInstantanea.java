package apps;

//A classe apps.MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente os filhos conhecem este metodo
    protected void validarConectadoInternet() {
        System.out.println("Validando se está Conectado a internet");
    }
}
