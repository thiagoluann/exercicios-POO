package matriz2X2;

import java.util.Scanner;

public class demoMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os elementos da Matriz:");
        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();     
        float n3 = scanner.nextFloat();
        float n4 = scanner.nextFloat();

        matriz matriz = new matriz(n1, n2, n2, n4);

        System.out.println();

        System.out.println(matriz);
        System.out.println("Determinante: "+matriz.determinante()+"\n\n");
        

        scanner.close();

    }
    
}
