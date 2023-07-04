/*9. Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
espadas). O programa deve imprimir o nome da carta por extenso. */

import java.util.Scanner;

public class cartas {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String carta = null, naipe = null;
        int numCarta, numNaipe;

        System.out.print("Insira o valor da carta: ");
        numCarta = scanner.nextInt();

        System.out.print("Escolha o naipe do carta (1 = ouros, 2 = paus, 3 = copas e 4 = espadas)");
        numNaipe = scanner.nextInt();

        if(numCarta == 1){
            carta = "As";
        }
        else if(numCarta == 2){
            carta = "Dois";
        }
        else if(numCarta == 3){
            carta = "Tres";
        }
        else if(numCarta == 4){
            carta = "Quatro";
        }
        else if(numCarta == 5){
            carta = "Cinco";
        }
        else if(numCarta == 6){
            carta = "Seis";
        }
        else if(numCarta == 7){
            carta = "Sete";
        }
        else if(numCarta == 8){
            carta = "Oito";
        }
        else if(numCarta == 9){
            carta = "Nove";
        }
        else if(numCarta == 10){
            carta = "Dez";
        }
        else if(numCarta == 11){
            carta = "Onze";
        }
        else if(numCarta == 12){
            carta = "Doze";
        }
        else if(numCarta == 13){
            carta = "Rei";
        }
        else{
            System.out.println("Numero invalido");
        }

        if(numNaipe == 1){
            naipe = "Ouros";
        }
        else if(numNaipe == 2){
            naipe = "Paus";
        }
        else if(numNaipe == 3){
            naipe = "Copas";
        }
        else if(numNaipe == 4){
            naipe = "Espadas";
        }
        else{
            System.out.println("Nao existe o Naipe escolhido.");
        }

        System.out.println("A sua carta eh "+carta+" de "+naipe);



        scanner.close();
    }    
}
