public class Main {
    public static void main(String[] args) {
        // Criando cursos
        Curso cursoJava = new Curso("Java Básico", 8);
        Curso cursoJS = new Curso("JavaScript Básico", 4);

        // Criando mentorias
        Mentoria mentoriaJava = new Mentoria("Mentoria Java Avançado", 2);
        
        // Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp de Desenvolvimento");
        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarCurso(cursoJS);
        bootcamp.adicionarCurso(mentoriaJava);

        // Criando desenvolvedor
        Dev dev = new Dev("João");
        dev.concluirCurso(cursoJava);
        dev.concluirCurso(mentoriaJava);

        // Exibindo informações
        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Cursos e Mentorias no Bootcamp: " + bootcamp.getCursos());
        System.out.println(dev);
    }
}

