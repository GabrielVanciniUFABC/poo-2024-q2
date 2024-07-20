package aula04.biblioteca;

class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    String isbn;
    boolean emprestado;

    Livro (String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.emprestado = false;
    }

    void emprestar() {
        this.emprestado = true;
    }

    void devolver() {
        this.emprestado = false;
    }

    boolean isEmprestado() {
        return this.emprestado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}