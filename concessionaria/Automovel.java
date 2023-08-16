package concessionaria;

public class Automovel {
    private int ano;
    private String modelo;
    private String cor;

    public Automovel(int ano, String modelo, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }
    
    public int getAno() {
        return ano;
    }



    public String getModelo() {
        return modelo;
    }



    protected String getCor() {
        return cor;
    }

    public double quantoCusta(){
        return (ano <= 2000) ? 25000.00 : 40000.00;
    }
}
