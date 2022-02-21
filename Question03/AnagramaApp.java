package Question03;

import java.util.*;

public class AnagramaApp {
    public  static int anagramas(String palavra) {

        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i; j < palavra.length(); j++) {
                char[] substrings = palavra.substring(i, j + 1).toCharArray();
                Arrays.sort(substrings);
                String novaPalavra = new String(substrings);

                if (hashMap.containsKey(novaPalavra)) {
                    hashMap.put(novaPalavra, hashMap.get(novaPalavra) + 1);
                } else {
                    hashMap.put(novaPalavra, 1);
                }
            }
        }
        int paresAnagrama = 0;
        for (String novaPalavra : hashMap.keySet()) {
            int i = hashMap.get(novaPalavra);
            paresAnagrama += (i * (i - 1)) / 2;
        }
        return paresAnagrama;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra desejada: ");
        String palavra = scanner.next();

        System.out.print(anagramas(palavra) + " possibilidade de anagramas para a palavra em questão");

    }

}
