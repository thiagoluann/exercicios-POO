package concessionaria;

public class DemoAutomovel {
    public static void main(String[] args) {
        AutomovelDeLuxo auto = new AutomovelDeLuxo(1999, "Hilux", "Preto", true, true, true, true);

        System.out.println("Veiculo: "+auto );
        System.out.print("Custo: "+auto.quantoCusta());
        
    }
    
}
