package aluno;

public class DemoAluno {
    public static void main(String[] args){
        
        Aluno aluno1 = new Aluno(0, null, 0, 0, 0, 0);

        aluno1.media();
        System.out.println("O aluno vai precisar de: " +  aluno1.provaFinal());
        
    }
    
}
