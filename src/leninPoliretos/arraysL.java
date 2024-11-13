package leninPoliretos;
public class arraysL {

    public void array2(int nivel, String caracter) {
        System.out.println("Array 2");
        for (int fila = 1; fila <= nivel; fila++) {
            for (int columna = 1; columna <= ((nivel * 2) + 1); columna++) {
                if ((fila == nivel && columna <= nivel)
                        || (fila == 1 && columna > nivel + 1)
                        || (fila == (nivel / 2) + 1 && columna > nivel + 1)
                        || columna == 1
                        || columna == (nivel + 2)
                        || columna == (nivel * 2) + 1) {
                    System.out.print(caracter + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void array3(String nombre) {
        System.out.println("Array 3");
        for (int i = nombre.length() - 1; 0 <= i; i--)
        System.out.println(String.format("%2d", (i + 1)) + " |" + " ".repeat(i) + " " + nombre.charAt(i));
        System.out.println(" 0 |" + "_".repeat(nombre.length() + 2));
        System.out.println();
    }

    public void ShowArray4(String nombre, String apellido) {
        System.out.println("Array 4");
        int tamañoMatriz = Math.max(nombre.length(), apellido.length()) + 1;
        char[][] matriz = new char[tamañoMatriz][tamañoMatriz];
        for (int fila = 0; fila < tamañoMatriz; fila++) {
            for (int columna = 0; columna < tamañoMatriz; columna++) {
                matriz[fila][columna] = ' ';
            }
        }
        for (int fila = 0; fila < nombre.length(); fila++) {
            matriz[fila][fila] = nombre.charAt(fila);
        }
        for (int fila = 0; fila < apellido.length(); fila++) {
            matriz[fila][tamañoMatriz - fila - 1] = apellido.charAt(fila);
        }
        for (int fila = 0; fila < tamañoMatriz; fila++) {
            for (int columna = 0; columna < tamañoMatriz; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void array5Lenin() {
        System.out.println("Array 5");
        System.out.println("Nombre completo: Lenin Alexander Amangandi Llumiguano");
        String nombresCompleto = "Lenin Alexander Amangandi Llumiguano";
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
        System.out.println();
    }

}
