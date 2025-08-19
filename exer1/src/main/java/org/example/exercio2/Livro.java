package org.example.exercio2;

public class Livro {
    private String Titulo;
    private String Autor;
    private int NumeroDePaginas;
    private int Valordecomprar;

    public Livro(String titulo, String autor, int numeroDePaginas, int valordecomprar) {
        Titulo = titulo;
        Autor = autor;
        NumeroDePaginas = numeroDePaginas;
        Valordecomprar = valordecomprar;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        NumeroDePaginas = numeroDePaginas;
    }

    public int getValordecomprar() {
        return Valordecomprar;
    }

    public void setValordecomprar(int valordecomprar) {
        Valordecomprar = valordecomprar;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", NumeroDePaginas=" + NumeroDePaginas +
                ", Valordecomprar=" + Valordecomprar +
                '}';
    }
}
