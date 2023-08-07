import java.util.Scanner;

public class CDU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 3 dígitos no formato CDU: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 999) {
            int centena = numero / 100;
            int dezena = (numero % 100) / 10;
            int unidade = numero % 10;

            int novoNumero = unidade * 100 + dezena * 10 + centena;

            System.out.println("O número reescrito no formato UCD é: " + novoNumero);
        } else {
            System.out.println("O número digitado não está no formato CDU (Centena, Dezena e Unidade).");
        }

        scanner.close();
    }
}