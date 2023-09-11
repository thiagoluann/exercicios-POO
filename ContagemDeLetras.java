import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContagemDeLetras {
    public static void main(String[] args) {
        String texto = "HELLO THERE";
        texto = texto.toUpperCase(); // Converter para maiúsculas para considerar letras maiúsculas e minúsculas iguais

        // Criar um mapa para armazenar a contagem de letras
        Map<Character, Integer> contagemDeLetras = new HashMap<>();

        // Iterar através da string e contar as ocorrências de cada letra
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (Character.isLetter(letra)) {
                contagemDeLetras.put(letra, contagemDeLetras.getOrDefault(letra, 0) + 1);
            }
        }

        // Criar um TreeMap para ordenar o resultado em ordem alfabética
        Map<Character, Integer> contagemOrdenada = new TreeMap<>(contagemDeLetras);

        // Exibir os resultados em ordem alfabética
        for (Map.Entry<Character, Integer> entry : contagemOrdenada.entrySet()) {
            char letra = entry.getKey();
            int quantidade = entry.getValue();
            System.out.println(letra + ": " + quantidade);
        }
    }
}

            