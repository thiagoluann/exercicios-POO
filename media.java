/*2. Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
valores reais serão informados pelo usuário. */

import java.util.Scanner;

public class media {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1, n2, n3;
        float m;
        System.out.print("Digite um numero: ");
        n1 = scanner.nextInt();

        System.out.print("Digite outro numero: ");
        n2 = scanner.nextInt();

        System.out.print("Digite mais um numero: ");
        n3 = scanner.nextInt();

        m = (n1 + n2 + n3)/3;
        System.out.print("A media dos mumeros inseridos eh: "+m);
    }
    
}
