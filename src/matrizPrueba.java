import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class matrizPrueba {

    public void ShowArray5For(String nombresCompletos) throws InterruptedException {
        Random random = new Random();
        char[][] matriz = new char[7][7];
        char[] chars = nombresCompletos.replaceAll("\\s", "").toCharArray();

        List<Character> caracteres = new ArrayList<>();
        for (char c : chars) {
            caracteres.add(c);
        }

        Collections.shuffle(caracteres);
        int index = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (index < caracteres.size() && random.nextInt(4) != 0) {
                    char c = caracteres.get(index);
                    if (i < chars.length && c == chars[i]) {
                        matriz[i][j] = '*';
                    } else {
                        matriz[i][j] = c;
                    }
                    index++;
                } else {
                    matriz[i][j] = ' ';
                }
                sb.append(matriz[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        Thread.sleep(1000);
    }

}
