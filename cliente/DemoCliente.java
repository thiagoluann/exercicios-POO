/*40. Crie um objeto de uma classe chamada Cliente com os atributos id, nome, idade, telefone.
Faça um programa para solicitar os dados de vários clientes e armazenar em um ArrayList
até que se digite um número de id negativo. Em seguida, exiba os dados de todos os
clientes. */

package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList <Cliente> clientes = new ArrayList<>();
       

        while(true){
            System.out.print("Digite o id do Cliente: ");
            int id = scanner.nextInt();

            if (id < 0){
                break;
            }

            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.next();

            System.out.print("Digite a idade do cliente: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o telefone do cliente: ");
            String telefone = scanner.next();

            System.out.println();

            Cliente cliente = new Cliente(id, nome, idade, telefone);
            clientes.add(cliente);
        }
        System.out.println(clientes);
    }
    
}
