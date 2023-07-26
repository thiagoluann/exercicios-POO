/*31. Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), o total de
andares no prédio (desconsiderando o térreo), a capacidade do elevador e quantas pessoas
estão presentes nele. Outras classes não devem ter acesso direto aos atributos de
Elevador. A classe deve também disponibilizar os seguintes métodos:

• construtor : que deve receber como parâmetros a capacidade do elevador e o total
de andares no prédio (um elevador sempre começa no térreo e vazio);

• entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);

• sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);

• sobe : para subir um andar (não deve subir se já estiver no último andar);

• desce : para descer um andar (não deve descer se já estiver no térreo).

Escreva um aplicativo de teste que demonstre as capacidades da classe criada, ou seja,
execute todos os métodos da classe. */

package elevador;

import java.util.Scanner;

public class DemoElevador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elevador elevador = new Elevador(10,20);

       

        while(true){
            System.out.println("ESCOLHA O QUE DESEJA FAZER:\n(1) Entrar no elevador\n(2) Subir um andar\n(3) Descer um andar\n(4) Sair do elevador\n(0) Encerrar programa");
            int opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    elevador.entra();
                break;

                case 2:
                    elevador.sobe();
                break;

                case 3:
                    elevador.desce();
                break;

                case 4:
                    elevador.sai();
                break;

                case 0:
                    System.out.println("encerrando o programa...");
                    return;

                default:
                    System.out.println("Opcao invalida.");
                break;
            }
        }

        
        
        
    }

}
