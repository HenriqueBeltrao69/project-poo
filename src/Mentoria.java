public class Mentoria extends Curso {

    public Mentoria(String titulo, int cargaHoraria) {
        super(titulo, cargaHoraria);
    }

    // Sobrescreve o método toString() para personalizar a exibição
    @Override
    public String toString() {
        return "Mentoria: " + getTitulo() + " - Carga Horária: " + getCargaHoraria() + " horas";
    }
}
