public class Curso {
    private String titulo;
    private int cargaHoraria;

    public Curso(String titulo, int cargaHoraria) {
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " + titulo + " - Carga Horária: " + cargaHoraria + " horas";
    }
}
