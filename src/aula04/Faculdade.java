package aula04;

public class Faculdade {
    public static void main(String[] args) {
        Professor professor = new Professor("Jose Anchieta", "12121212", 8, "Pramação Avançada");
        Aluno aluno = new Aluno("Kawane", "2323232323", "495748678");

        professor.ensinar();
        aluno.exercitar();

        System.out.println(aluno.toString());
        System.out.println(professor.toString());
    }
}
