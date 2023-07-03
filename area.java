/*1. Escreva um programa que calcule a área de um quadrado. O valor do lado de um quadrado
deverá ser informado pelo usuário. */

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado do quadrado: ");
        int l = scanner.nextInt();
        int area = l * l;
        

        System.out.print("A area do quadrado eh: "+area);
        
        
    }
}

