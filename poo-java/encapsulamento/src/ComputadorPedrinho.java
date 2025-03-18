public class ComputadorPedrinho {
    public static void main(String[] args) {
        //Abrindo MSN Messenger
        MSNMesseger msn = new MSNMesseger();

        //msn.validarConectadoInternet();
        msn.enviarMensagem();
       // msn.salvarHistoricoMensagem();

        msn.receberMensagem();
    }
}