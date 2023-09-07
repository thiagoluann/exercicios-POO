package biblioteca;

public class livroBiblioteca extends livroLivraria{
    private double preco;

    public livroBiblioteca(String nomeLivro, String autor, int anoPublicado, double preco) {
        super(nomeLivro, autor, anoPublicado);
        this.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString() + " [preco=" + preco + "]";
    }

    
}
