package biblioteca;

public class livroLivraria {
    private String nomeLivro;
    private String autor;
    private int anoPublicado;
   
    public livroLivraria(String nomeLivro, String autor, int anoPublicado) {
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }
    

    @Override
    public String toString() {
        return " [nomeLivro=" + nomeLivro + ", autor=" + autor + ", anoPublicado=" + anoPublicado + "]";
    }


    public String getNomeLivro() {
        return nomeLivro;
    }


    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getAnoPublicado() {
        return anoPublicado;
    }


    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }
    
    
}
