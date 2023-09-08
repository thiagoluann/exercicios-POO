package computador;

public class Computador extends Equipamento {
    private String tipoProcessador;
    private String geracao;

    public Computador(int quantidade, float preco, String tipoProcessador, String geracao) {
        super(quantidade, preco);
        this.tipoProcessador = tipoProcessador;
        this.geracao = geracao;
    }

    public String getTipoProcessador() {
        return tipoProcessador;
    }

    public void setTipoProcessador(String tipoProcessador) {
        this.tipoProcessador = tipoProcessador;
    }

    public String getGeracao() {
        return geracao;
    }

    public void setGeracao(String geracao) {
        this.geracao = geracao;
    }

    @Override
    public String toString() {
        return "Computador\n [tipoProcessador=" + tipoProcessador + ", geracao=" + geracao + super.toString();
    }

    
    
}
