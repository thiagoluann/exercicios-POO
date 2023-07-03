/*7. Escreva um programa que lê três números e determina qual número é o menor */

import java.util.Scanner;

public class menor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Digite um numero: ");
        n1 = scanner.nextInt();

        System.out.print("Digite outro numero: ");
        n2 = scanner.nextInt();

        System.out.print("Digite mais um numero: ");
        n3 = scanner.nextInt();

        if(n1 < n2 && n1 < n3){
            System.out.print("O menor numero eh "+n1);
        }
        else if(n2 < n1 && n2 < n3){
            System.out.print("O menor numero eh "+n2);
        }
        else{
            System.out.print("O menor numeeo eh "+n3);
            // scanner.close();
        }
    }
}
