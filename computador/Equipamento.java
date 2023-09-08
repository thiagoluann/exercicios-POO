package computador;

public class Equipamento {
    private int quantidade;
    private float preco;

    public Equipamento(int quantidade, float preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }
    
    
}
