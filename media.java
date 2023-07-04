 /*2. Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
valores reais serão informados pelo usuário. */

import java.util.Scanner;

public class media {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double n1, n2, n3;
        double m = 0.0;
        System.out.print("Digite um numero: ");
        n1 = scanner.nextDouble();

        System.out.print("Digite outro numero: ");
        n2 = scanner.nextDouble();

        System.out.print("Digite mais um numero: ");
        n3 = scanner.nextDouble();

        m = (n1 + n2 + n3)/3;
        System.out.print("A media dos mumeros inseridos eh: "+m);
    }
    
}
