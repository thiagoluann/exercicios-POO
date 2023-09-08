import java.util.Random;

public class Questao42 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frequenciaSomas = new int[13];

        for(int i = 0; i < 36000; i++){
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt( 6) + 1;
            int soma = dado1 + dado2;

            frequenciaSomas[soma]++;
        }
        
        System.out.println("Resultado das somas após os 36000 lançamentos: ");
        for(int i = 2; i <= 12; i++){
            System.out.println("Soma " + i + ": " + frequenciaSomas[i] + " vezes");
        
        }
    }
    
}
