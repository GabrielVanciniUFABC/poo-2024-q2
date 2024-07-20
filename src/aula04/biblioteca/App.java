package aula04.biblioteca;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954, "123");
        Livro livro2 = new Livro("O Hobbit", "J. R. R. Tolkien", 1937, "456");
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "789");
        Livro livro4 = new Livro("Guerra e Paz", "Lev Tolstói", 1869, "325");
        Livro livro5 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967, "961");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        livro1.emprestar();
        livro3.emprestar();
        livro2.emprestar();
        livro1.devolver();
        biblioteca.removerLivro(livro5.isbn);

        System.out.println("Livros emprestados:");
        for (Livro livro : biblioteca.listaEmprestados()) {
            System.out.println(livro.titulo);
        }

        System.out.println();

        System.out.println("Livros disponíveis:");
        for (Livro livro : biblioteca.listaDisponiveis()) {
            System.out.println(livro.titulo);
        }
    }
}