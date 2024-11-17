import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Curso> cursosConcluidos;

    public Dev(String nome) {
        this.nome = nome;
        this.cursosConcluidos = new ArrayList<>();
    }

    public void concluirCurso(Curso curso) {
        cursosConcluidos.add(curso);
    }

    public List<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }

    @Override
    public String toString() {
        return "Dev: " + nome + " - Cursos Concluídos: " + cursosConcluidos;
    }
}
