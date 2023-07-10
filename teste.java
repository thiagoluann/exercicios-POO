import javax.swing.JOptionPane;
public class teste {
    public static void main(String[] args) {
        String name =
        JOptionPane.showInputDialog("Qual é o seu nome?");
        String mensage = 
        String.format("Olá "+name+" meu chegado! você é o melor jogador de jogo da velha do mundo!" );
        JOptionPane.showMessageDialog(null,mensage);

    
        
    }
    
}
