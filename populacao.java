/*17. Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A
cidade A tem um crescimento populacional de 3,5% ao ano, enquanto a população da
cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a quantidade
de anos necessária para que a população da cidade A seja maior ou igual a população
da cidade B. */

import java.util.Scanner;

public class populacao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        

        double cidadeA = 7000.0, cidadeB = 20000.0, crescimentoA = 0.01, crescimentoB = 0.035;
        int qntAnos = 0;
        
        

        System.out.println("A cidade 'A' tem 7000 habitantes\nA cidade 'B' tem 20000 habitantes " );
        while(cidadeA <= cidadeB){
            cidadeA = crescimentoA * cidadeA + cidadeA;
            cidadeB = crescimentoB * cidadeB + cidadeB;
            
            qntAnos++;
            
        }

        System.out.println("A cidade 'A' demorou "+qntAnos+" para ter uma populacao maior ou igual a cidade 'B'");
        System.out.println("A cidade 'A' vai ter "+cidadeA+" habitantes e a 'B' "+cidadeB+" habitantes");

       
        scanner.close();
    }
    
}
