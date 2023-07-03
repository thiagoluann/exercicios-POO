/*4. Escreva um programa que receba uma temperatura em graus centígrados e a apresente
em graus Fahrenheit. */

import java.util.Scanner;

public class temperatura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        float c, f;
        System.out.print("Digite a temperatura em Celsius: ");
        c = scanner.nextFloat();
        
        f = (float) (c * 1.8 + 32);
        System.out.println("A temperatura em fahrenheit eh: "+f);
    }
}
