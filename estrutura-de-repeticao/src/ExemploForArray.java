public class ExemploForArray {
    public static void main(String[] args) {

        //em arrays o indice comeca em 0
        String alunos[] = {"FELIPE", "JOÃO", "JUNIOR", "NICOLAS"};

        for(int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        //Forma abreviada
        //for(String aluno : alunos) {
            //System.out.println(alunos)
        }
    }
}
