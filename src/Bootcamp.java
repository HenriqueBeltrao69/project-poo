import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private List<Curso> cursos;

    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public String getNome() {
        return nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
