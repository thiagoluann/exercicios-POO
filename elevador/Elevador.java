package elevador;

public class Elevador {
    private int andarAtual = 0;
    private int qtdAndares;
    private int qtdPessoas = 0;
    private int capacidadeElevador;

    public Elevador(int capacidadElevador, int qtdAndares) {
        this.capacidadeElevador = capacidadElevador;
        this.qtdAndares = qtdAndares;
    }

    void entra(){
        if (qtdPessoas < capacidadeElevador ){
            System.out.println("\nAlguem entrou no elevador...");
            qtdPessoas++;
            System.out.println("Agora tem "+qtdPessoas+" pessoas no elevador.\n");
        }
        else{
            System.out.println("\nElevador lotado!\n");
        }
    }

    void sai(){
        if(qtdPessoas != 0){
            System.out.println("\nAlguém saiu do elevador.");
            qtdPessoas --;
            System.out.println("Agora tem "+qtdPessoas+" pessoas no elevador.\n");
        }
        else{
            System.out.println("\nNinguém está no elevador\n");
        }
    }

    void sobe(){
        if(andarAtual == qtdAndares){
            System.out.println("\nNao eh mais possivel subir, pois ja esta no ultimo andar.\n");
        } 
        else{
            System.out.print("\nSubindo... ");
            andarAtual ++;
            System.out.println("Andar "+andarAtual+"\n");
        }       
    }

    void desce(){
        if(andarAtual == 0){
            System.out.println("\nNao eh mais possivel descer, pois ja esta no terreo.\n");
        }
        else{
            System.out.print("\nDescendo... ");
            andarAtual--;
            System.out.println("Andar "+andarAtual+"\n");
        }

    }

}
