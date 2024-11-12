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

    public void g1_crearFigura9(int tamanio) {
        System.out.println("Figura 9:");
        int aux1 = (tamanio - 1) * 4, aux2 = 3;
        String cadenaGuion = "___";
        for (int fila = 0; fila < tamanio; fila++) {
            for (int espaciosIzq = 0; espaciosIzq < aux1; espaciosIzq++) {
                System.out.print(" ");
            }
            if (fila == 0) {
                System.out.println(cadenaGuion);
                aux1 -= 4;
            }
            if (fila > 0) {
                System.out.print(cadenaGuion + "|");
                aux1 -= 4;
                for (int espaciosInternos = 0; espaciosInternos < aux2; espaciosInternos++) {
                    System.out.print(" ");
                }
                System.out.println("|" + cadenaGuion);
                aux2 += 8;
            }
        }
        System.out.println();
    }

    public void figura3Lenin(int nivel) {
        System.out.println("Figura N3");
        for (int fila = 1; fila <= nivel; fila++) {
            System.out.println("* ".repeat(fila));
        }
    }

    public void figura6Lenin(int nivel) {
        System.out.println("Figura N6");
        for (int fila = 1; fila <= nivel; fila++) {
            System.out.println(" ".repeat(nivel - fila) + "* ".repeat(fila));
        }
    }

    public void figura4Lenin(int nivel) {
        System.out.println("Figura N4");
        for (int fila = nivel - 1, j = 1; 0 <= fila && j <= nivel; fila--, j++) {
            System.out.println("  ".repeat(fila) + "* ".repeat(j));

            // System.out.print(" ".repeat(nivel - fila));
            // System.out.print("* ".repeat(fila));
            // System.out.println();
        }
    }

    public void figura13Lenin(int nivel) {
        System.out.println("Figura N13");
        for (int fila = 0; fila <= nivel; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }

    public void figura12Lenin(int nivel) {
        System.out.println("Figura N12");
        for (int fila = nivel; 0 < fila; fila--) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }

}
