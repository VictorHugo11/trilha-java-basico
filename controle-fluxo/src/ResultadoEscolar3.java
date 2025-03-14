// Cenário 1, com duas condicionais
public class ResultadoEscolar3 {
    public static void main(String[] args) {

        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}

// Cenário 2, com três condicionais
class ResultadoEscolarCenario2 {
    public static void main(String[] args) {

        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}