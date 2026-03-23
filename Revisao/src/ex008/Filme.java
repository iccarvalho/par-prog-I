package ex008;

public class Filme {
    private int id, duracaoMinutos;
    private String titulo, genero;

    public Filme() {}

    public Filme(int id, int duracaoMinutos, String titulo, String genero) {
        this.id = id;
        this.duracaoMinutos = duracaoMinutos;
        this.titulo = titulo;
        this.genero = genero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return this.id;
    }

    public int getDuracaoMinutos() {
        return this.duracaoMinutos;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    @Override
    public String toString() {
        return "{ " +
                "id: " + this.id +
                ", duracaoMinutos: " + this.duracaoMinutos +
                ", titulo: " + this.titulo +
                ", genero: " + this.genero +
                " }";
    }
}
