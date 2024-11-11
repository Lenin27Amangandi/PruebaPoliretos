import java.util.Random;

public class oneOportunit {

    public void array5Lenin() {
        System.out.println();
        String nombresCompleto = "Lenin Liame Laxus Reiss";
        String[] arregloNombres = nombresCompleto.split(" ");
        String primeraPalabra = arregloNombres[0];
        int tamañoMatriz = primeraPalabra.length();
        char matriz[][] = new char[tamañoMatriz][tamañoMatriz];

        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                matriz[i][j] = ' ';
            }
        }

        for (int contador = 0; contador < arregloNombres.length; contador++) {
            primeraPalabra = arregloNombres[contador];
            for (char letras : primeraPalabra.toCharArray()) {
                int x, y;
                x = (int) (Math.random() * tamañoMatriz);
                y = (int) (Math.random() * tamañoMatriz);
                if (matriz[x][y] != ' ') {
                    matriz[x][y] = '*';
                } else {
                    matriz[x][y] = letras;
                }
            }
        }

        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                System.out.print(matriz[i][j] + " ");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }

    public long factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

    public int multiplicacion(int a, int b) {
        if (b == 0 || a == 0) {
            return 0;
        } else {
            return a + multiplicacion(a, b - 1);
        }
    }

    public int suma(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;

        } else {
            return 1 + suma(a, b - 1);
        }
    }

}
