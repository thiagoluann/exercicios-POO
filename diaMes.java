/*12. O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado
o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia
da semana correspondente.
• Exemplo de entrada: 10
• Exemplo de saída: O dia 10 será uma terça-feira. */

import java.util.Scanner;

public class diaMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cod;

        System.out.print("Escolha algum dia do mes de fevereiro de 2015: ");
        cod = scanner.nextInt();

        switch(cod){
            case 1:
            case 8:
            case 15:
            case 22:
                System.out.println("O dia "+cod+" eh domingo");
            break;

            case 2:
            case 9:
            case 16:
            case 23:
                System.out.println("O dia "+cod+" eh segunda-feira");
            break;

            case 3:
            case 10:
            case 17:
            case 24:
                System.out.println("O dia "+cod+" eh terca-feira");
            break;

            case 4:
            case 11:
            case 18:
            case 25:
                System.out.println("O dia "+cod+" eh quarta-feira");
            break;

            case 5:
            case 12:
            case 19:
            case 26:
                    System.out.println("O dia "+cod+" eh quinta-feira");
            break;

            case 6:
            case 13:
            case 20:
            case 27:
                    System.out.println("O dia "+cod+" eh sexta-feira");
            break;

            case 7:
            case 14:
            case 21:
            case 28:
                    System.out.println("O dia "+cod+" eh sabado");
            break;

            default:
                System.out.println("Nao existe esse dia, pois fevereiro tem 28 dias.");
        }

        scanner.close();
    }        

    
}
