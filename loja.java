/*8. Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
dois setores:

• No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
500 vão ter 10% de desconto.

• No setor de Cama, mesa e banho, que possui código 111, peças com valor acima
de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.

Escreva um programa que recebe do usuário o código do setor da loja e o valor original de
um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido.
 */

import java.util.Scanner;

public class loja {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double preco, novoValor;
        int codigo;

        System.out.println("SEJAM BEM-VINDOS A NOSSA LOJA! ");
        System.out.println("NOSSA LOJA ESTA COM PROMOCOOES EM DOIS SETORES, O DE ELETROS E O DE CAMA MESA E BAMHO. ");
        System.out.println("NO SETOR DE ELETROS AS PROMOCOES SAO:\n");
        
        System.out.println("-------CODIGO 222----------------CODIGO 111--------------------------");
        System.out.println("|\tELETROS\t\t\t    CMB\t\t\t\t    |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("| > 500 R$: 10% de desconto | > 100 R$: 40% de desconto             |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                           | >= 50 R$ e <= 100 R$: 20% de desconto |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                           | < 50 R$: 10% de desconto              |");
        System.out.println("---------------------------------------------------------------------");

        System.out.print("Escolha o codigo da loja: (111) ou (222): ");
        codigo = scanner.nextInt();

        switch(codigo){
            case 111:
                System.out.println("\nBEM-VINDO AO SETOR DE CAMA, MESA E BANHO.");
                System.out.print("Informe o valor de suas compras: ");
                preco = scanner.nextDouble();
                
                if(preco > 100){
                    novoValor = preco - preco *(40/100);
                    System.out.println("\nSuas compras custaram "+preco+" reais, com o desconto ficou "+novoValor+" reais.");
                }
                else if(preco >= 50 || preco <= 100){
                    novoValor = preco - preco * (20/100);
                    System.out.println("\nSuas compras custaram "+preco+" reais, com o desconto ficou "+novoValor+" reais.");
                }
                else{
                    novoValor = preco - preco*(10/100);
                    System.out.println("\nSuas compras custaram "+preco+" reais, com o desconto ficou "+novoValor+" reais.");
                }
                break;

                case 222:
                System.out.println("\nBEM-VINDO AO SETOR DE ELETRONICOS!");
                System.out.print("Informe o valor dE SUAS compras: ");
                preco = scanner.nextDouble();

                if(preco > 500){
                    novoValor = preco - preco *(10/100);
                    System.out.println("\nSuas compras custaram "+preco+" reais, com o desconto ficou "+novoValor+" reais.");
                }
                else{
                    System.out.println("\nSuas compras foram menores que 500 reais, portanto nao houve desconto");
                }
                break;

                default:
                    System.out.println("Setor invalido");
        }
        scanner.close();
    }
}
