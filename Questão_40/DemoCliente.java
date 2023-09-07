package Questão_40;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os dados do clinte:");

        while(true){
            System.out.print("ID: ");
            int id = scanner.nextInt();
            if(id < 0){
                break;
            }

            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Telefone: ");
            String endereco = scanner.next();

            System.out.println();

            Cliente cliente = new Cliente(id, nome, idade, endereco);
            clientes.add(cliente);
        }

        for(Cliente cliente : clientes){
            System.out.println("\n" +cliente);
        }

        scanner.close();
    }
}
