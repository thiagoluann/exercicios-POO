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
            System.out.println("Alguem entrou no elevador...");
            qtdPessoas++;
            System.out.println(qtdPessoas);
        }
        else{
            System.out.println("Elevador lotado!");
        }
    }

    void sai(){
        if(qtdPessoas != 0){
            System.out.println("Alguém saiu do elevador.");
            qtdPessoas --;
            System.out.println(qtdPessoas);
        }
        else{
            System.out.println("Ninguém está no elevador");
        }
    }

    void sobe(){
        if(andarAtual == qtdAndares){
            System.out.println("Nao eh mais possivel subir, pois ja esta no ultimo andar.");
        } 
        else{
            System.out.print("\nSubindo... ");
            andarAtual ++;
            System.out.println(andarAtual);
        }       
    }

    void desce(){
        if(andarAtual == 0){
            System.out.println("Nao eh mais possivel descer, pois ja esta no terreo.");
        }
        else{
            System.out.println("\nDescendo...");
            andarAtual--;
            System.out.println(andarAtual);
        }

    }

}
