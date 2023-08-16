package concessionaria;

public class AutomovelDeLuxo  extends AutomovelBasico {
    protected boolean arCondicionado;
    private boolean direcaoHidraulica;

    public AutomovelDeLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCondicionado,
        boolean direcaoHidraulica) {
        super(ano, modelo, cor, airbag, radio);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }
    
    public double quantoCusta(){
        double custo = super.quantoCusta();
        if (arCondicionado) custo += 3488.34;
        if (direcaoHidraulica) custo += 5090.22;
        return custo;
    }

    @Override
    public String toString() {

        String res = "ano= " + super.getAno();
        res += ", modelo= " + super.getModelo();
        res += ", cor= " + super.getCor();
        res += ", airbag= " + (airbag ? "sim" : "nao");
        res += ", radio= " + (radio ? "sim" : "nao");
        res += ", arCondicionado= " + (arCondicionado ? "sim" : "nao");
        res += ", direcaoHidraulica= " + (direcaoHidraulica ? "sim" : "nao");
        return res;
    }
    
}
 