public class lampada{
    public static void main(String[] args) {
        boolean EstaLigada = false;
    }   
    
    void acender(boolean EstaLigada){
        EstaLigada = true;
    }
    void apagar(boolean EstaLigada){
        EstaLigada = false;
    }
    void mostrarEstado(boolean EstaLigada){
        if (EstaLigada == true ){
            System.out.println("Lâmpada está ligada");
        }
        else{
            System.out.println("Lâmpada está desligada");
        }
    }
}