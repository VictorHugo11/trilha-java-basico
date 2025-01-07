//1 - ligar e desligar
//2 - aumentar e diminuir volume
//3 - mudar de canal

public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTV smartTv = new SmartTV();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual ? " + smartTv.canal);
        smartTv.mudarCanal(12);
        System.out.println("Canal atual ? " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal atual ? " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);
    }
}