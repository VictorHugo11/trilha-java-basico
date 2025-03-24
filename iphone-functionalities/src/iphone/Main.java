package iphone;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone("Iphone 16 Pro", 256);

        //testes
        iphone.tocar();
        iphone.ligar("1199998822");
        iphone.exibirPagina("https://github.com/VictorHugo11/trilha-java-basico/tree/master/iphone-functionalities");
    }
}
