package aluno;

import java.util.Scanner;

public class Aluno {
    Scanner scanner = new Scanner(System.in);
    private int matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double media;
    private double mediaFinal;

    public Aluno(int matricula, String nome, double notaProva1, double notaProva2, double media, double mediaFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.media = media;
        this.mediaFinal = mediaFinal;
    }
    

    public void media(){
        System.out.print("Digite o nome do aluno:");
        nome = scanner.next();

        System.out.print("Digite a matricula do aluno:");
        matricula = scanner.nextInt();

        System.out.print("Digite a primeira nota: ");
        notaProva1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        notaProva2 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        media = (notaProva1 * 2.5 + notaProva2 * 2.5 + notaTrabalho * 2.0)/5;
        
        System.out.println("A media do aluno eh "+media);
        
        scanner.close();
    }   
    
    public double provaFinal(){
        if(media >= 7 || media < 3.5){
            return 0;
        }
        else{
            mediaFinal = 7 - media;
            return mediaFinal;
        }

    }

}
