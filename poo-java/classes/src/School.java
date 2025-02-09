import model.Student;
import enums.Color;
import enums.Sex;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("John", 12, Color.FAIR, Sex.MALE);
        Student student2 = new Student("Sophia", 10, Color.FAIR, Sex.FEMALE);
        Student student3 = new Student("Lily", 11, Color.DARK, Sex.FEMALE);

        // Testando os métodos
        student1.eating("macarrão");
        student2.drinking("suco");
        student3.running();

        // Exibir informações
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}