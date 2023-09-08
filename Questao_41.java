public class Questao_41 {
    public static int calculaProduto(int ...numeros){
        int produto = 1;

        for(int numero: numeros){
            produto *=  numero;
        }
        return produto;
    }

    public static void main(String[] args) {
        int produto = calculaProduto(3, 3);
        System.out.println(produto);
    }
}
