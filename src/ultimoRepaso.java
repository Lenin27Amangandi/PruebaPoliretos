import java.util.Random;
import java.util.Scanner;

public class ultimoRepaso {

    public void moverFigura() {
        String figura = "\n\\|||/\n(> <)\nooO-(_)-Ooo";
        int longitudPantalla = 30; // Número de columnas en la "pantalla"
        int duracion = 100; // Duración de cada movimiento en ms

        // Mover hacia la derecha
        for (int i = 0; i < longitudPantalla; i++) {
            System.out.print("\r" + " ".repeat(i) + figura); // Mover a la derecha
            esperar(duracion);
        }

        // Mover hacia la izquierda
        for (int i = longitudPantalla; i > 0; i--) {
            System.out.print("\r" + " ".repeat(i) + figura); // Mover a la izquierda
            esperar(duracion);
        }
    }

    private void esperar(int duracion) {
        try {
            Thread.sleep(duracion);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void moverFigura2() {

        // Definir las líneas de la figura en un solo String con saltos de línea
        String figura = """
                   \\|||/
                   (> <)
                ooO-(_)-Ooo
                """;

        int longitudPantalla = 20; // Número de columnas para el desplazamiento máximo
        int duracion = 150; // Duración de cada movimiento en milisegundos

        // Mover a la derecha y luego regresar a la izquierda
        for (int j = 0; j < 2; j++) { // Repite la animación dos veces
            // Mover hacia la derecha
            for (int i = 0; i < longitudPantalla; i++) {
                System.out.print("\r" + " ".repeat(i) + figura.replace("\n", "\n" + " ".repeat(i)));
                esperar(duracion);
            }

            // Mover hacia la izquierda
            for (int i = longitudPantalla; i >= 0; i--) {
                System.out.print("\r" + " ".repeat(i) + figura.replace("\n", "\n" + " ".repeat(i)));
                esperar(duracion);
            }
        }
        System.out.println(); // Salto de línea al final para terminar la animación
    }

    public void moverFiguraHorizontal() {
        // Definir cada línea de la figura en un array para mantener el formato
        String[] figura = {
                "       \\|||/       ",
                "       (> <)       ",
                "    ooO-(_)-Ooo    "
        };

        int longitudPantalla = 30; // Número de espacios a la derecha de la pantalla
        int duracion = 150; // Duración en ms de cada movimiento

        // Mover la figura hacia la derecha y luego hacia la izquierda
        for (int j = 0; j < 2; j++) { // Repite la animación dos veces
            // Movimiento hacia la derecha
            for (int i = 0; i < longitudPantalla; i++) {
                System.out.print("\033[H\033[2J"); // Limpiar consola para que parezca que se mueve
                System.out.flush();

                // Desplazar cada línea de la figura hacia la derecha
                for (String linea : figura) {
                    System.out.println(" ".repeat(i) + linea);
                }

                pausar(duracion);
            }

            // Movimiento hacia la izquierda
            for (int i = longitudPantalla; i > 0; i--) {
                System.out.print("\033[H\033[2J"); // Limpiar consola para que parezca que se mueve
                System.out.flush();

                // Desplazar cada línea de la figura hacia la izquierda
                for (String linea : figura) {
                    System.out.println(" ".repeat(i) + linea);
                }

                pausar(duracion);
            }
        }
        System.out.println(); // Salto de línea al final
    }

    // Método para pausar la ejecución por una cantidad de milisegundos
    private void pausar(int duracion) {
        try {
            Thread.sleep(duracion);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void moverFiguraConMarco() {
        // Definir cada línea de la figura en un array para mantener el formato
        String[] figura = {
                "       \\|||/       ",
                "       (> <)       ",
                "    ooO-(_)-Ooo    "
        };

        int longitudPantalla = 30; // Número de espacios a la derecha de la pantalla
        int duracion = 150; // Duración en ms de cada movimiento
        int longitudMarco = longitudPantalla + 2; // Para incluir los bordes '|'

        // Mover la figura hacia la derecha y luego hacia la izquierda
        for (int j = 0; j < 2; j++) { // Repite la animación dos veces
            // Movimiento hacia la derecha
            for (int i = 0; i < longitudPantalla; i++) {
                System.out.print("\033[H\033[2J"); // Limpiar consola para que parezca que se mueve
                System.out.flush();

                // Imprimir el marco y la figura con el desplazamiento
                System.out.println("|" + " ".repeat(longitudMarco - 2) + "|"); // Línea superior del marco
                for (String linea : figura) {
                    System.out.println("|" + " ".repeat(i) + linea + " ".repeat(longitudPantalla - i) + "|");
                }
                System.out.println("|" + " ".repeat(longitudMarco - 2) + "|"); // Línea inferior del marco

                pausar(duracion);
            }

            // Movimiento hacia la izquierda
            for (int i = longitudPantalla; i > 0; i--) {
                System.out.print("\033[H\033[2J"); // Limpiar consola para que parezca que se mueve
                System.out.flush();

                // Imprimir el marco y la figura con el desplazamiento
                System.out.println("|" + " ".repeat(longitudMarco - 2) + "|"); // Línea superior del marco
                for (String linea : figura) {
                    System.out.println("|" + " ".repeat(i) + linea + " ".repeat(longitudPantalla - i) + "|");
                }
                System.out.println("|" + " ".repeat(longitudMarco - 2) + "|"); // Línea inferior del marco

                pausar(duracion);
            }
        }
        System.out.println(); // Salto de línea al final
    }

    public void mostrarNombreConProgreso() {
        String nombreCompleto = "Kenin Alaxis"; // Leer nombre completo
        // Obtener la longitud del nombre para calcular el porcentaje
        int longitudNombre = nombreCompleto.length();
        // Mostrar cada letra con su porcentaje de avance
        for (int i = 0; i < longitudNombre; i++) {
            // Calcular el porcentaje
            int porcentaje = (i + 1) * 100 / longitudNombre;
            // Construir la parte del nombre que se muestra hasta la letra actual
            String nombreParcial = nombreCompleto.substring(0, i + 1);
            // Mostrar la letra y el porcentaje en la misma línea
            System.out.print("\r" + nombreParcial + " " + porcentaje + "%");
            // Esperar un poco para hacer la animación más visible
            esperar(150); // Retraso de 150 ms
        }
        // Mostrar un salto de línea final después de completar el progreso
        System.out.println();
    }

    public void mostrarNombreConProgreso2() {
        String nombreCompleto = "Levi Ackerman"; // Leer nombre completo

        // Obtener la longitud del nombre para calcular el porcentaje
        int longitudNombre = nombreCompleto.length();

        // Mostrar cada letra con su porcentaje de avance
        for (int i = 0; i < longitudNombre; i++) {
            // Calcular el porcentaje
            int porcentaje = (i + 1) * 100 / longitudNombre;

            // Obtener la letra actual
            char letra = nombreCompleto.charAt(i);

            // Mostrar la letra y el porcentaje en una nueva línea
            System.out.println(letra + " " + porcentaje + "%");

            // Esperar un poco para hacer la animación más visible
            esperar(150); // Retraso de 150 ms
        }
    }

    public void mostrarNombreConProgreso3() {
        String nombreCompleto = "Levi Ackerman"; // Leer nombre completo
        // Obtener la longitud del nombre para calcular el porcentaje
        int longitudNombre = nombreCompleto.length();
        // Mostrar cada letra con su porcentaje de avance
        for (int i = 0; i < longitudNombre; i++) {
            // Calcular el porcentaje
            int porcentaje = (i + 1) * 100 / longitudNombre;
            // Obtener la letra actual
            char letra = nombreCompleto.charAt(i);
            // Espacios antes de la letra para que avance de izquierda a derecha
            String espacios = " ".repeat(i);
            // Mostrar la letra con su porcentaje alineado
            System.out.println(espacios + letra + " " + porcentaje + "%");
            // Esperar un poco para hacer la animación más visible
            esperar(150); // Retraso de 150 ms
        }
    }

    public void mostrarNombreConProgreso4() {
        String nombreCompleto = "LeninAlexander";
        int longitudNombre = nombreCompleto.length();
        for (int i = 0; i < longitudNombre; i++) {
            int porcentaje = (i + 1) * 100 / longitudNombre;
            char letra = nombreCompleto.charAt(i);
            String espacios = " ".repeat(i);
            String porcentajeStr = porcentaje + "%";
            String espaciosParaPorcentaje = " ".repeat(longitudNombre - i);
            System.out.println("[" + espacios + letra + espaciosParaPorcentaje + "] " + porcentajeStr);
            esperar(150);
        }
    }

    public void cadenaCaracter6(String frase) {
        String fraseInvertida = "";
        char actual;
        for (int i = frase.length() - 1; 0 <= i; i--) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'o' || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'u') {
                actual = frase.charAt(i);
                fraseInvertida = fraseInvertida + actual;
            } else {
                actual = frase.toUpperCase().charAt(i);
                fraseInvertida = fraseInvertida + actual;
            }
        }
        System.out.println("La palabra 6 es: " + fraseInvertida);
    }

    public void cadenaCaracter5(String frase) {
        String fraseInvertida = "";
        char actual;
        for (int i = frase.length() - 1; 0 <= i; i--) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'o' || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'u') {
                actual = frase.toUpperCase().charAt(i);
                fraseInvertida = fraseInvertida + actual;
            } else {
                actual = frase.charAt(i);
                fraseInvertida = fraseInvertida + actual;
            }
        }
        System.out.println("La palabra 5 es: " + fraseInvertida);
    }

    public void loading11(int nivel) {
        int numRandom;
        int espacio;
        String simbolo = "-";
        System.out.println();
        for (int i = 0; i < nivel; i++) {
            numRandom = (int) (Math.random() * 10);
            espacio = 10 - numRandom;
            System.out.println(numRandom + " ".repeat(espacio) + "\033[32m" + simbolo.repeat(numRandom) + "|"
                    + simbolo.repeat(numRandom));
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void serieCaracter4(int nivel) {
        System.out.println();
        String simbolos[] = { "+", "-", "*", "/" };
        for (int i = 0; i < nivel; i++) {
            System.out.print(simbolos[i % 4] + " ");
            // System.out.print("\r"+simbolos[i % 4]);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void serieCaracter5(int nivel) {
        System.out.println();
        String simbolos[] = { "\\", "|", "/", "-" };
        for (int i = 0; i < nivel; i++) {
            System.out.print(simbolos[i % 4] + " ");
            // System.out.print("\r"+simbolos[i % 4]);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void serieCaracter8(int nivel) {
        System.out.println();
        int numeroInpar;
        String letra;
        for (int i = 0; i < nivel; i++) {
            char simbolo = (char) ('a'+i);
            numeroInpar = (i*2)+1;
            letra=Character.toString(simbolo);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(letra.repeat(numeroInpar)+" ");
        }
    }

    public void showFigura9For(int nroNiveles){
        // int especial = nroNiveles;
        for (int espacio1 = 0; espacio1 < nroNiveles; espacio1++)
        System.out.print("    ");
        System.out.print("___");
        System.out.println();
        for (int filas = 0; filas < nroNiveles; filas++){
            // especial--;
            for (int espacio2 = 1; espacio2 < nroNiveles - filas; espacio2++)
                System.out.print("    ");
            System.out.print("___|");
            for (int espacio3 = nroNiveles + 1; espacio3 > nroNiveles - filas; espacio3--)
                System.out.print("   ");
            for (int espacio4 = nroNiveles; espacio4 > nroNiveles - filas; espacio4--)
                System.out.print("     ");
            System.out.print("|___");
            System.out.println();
        }
    }


    public static void generarBarrasDeSonido(int numBarras, int alturaMax) {
        Random random = new Random();
        int[] alturas = new int[numBarras];
        // Genera alturas aleatorias para cada barra
        for (int i = 0; i < numBarras; i++) {
            alturas[i] = random.nextInt(alturaMax + 1); // Altura entre 0 y alturaMax
        }
        // Construye la visualización de las barras de sonido
        for (int altura = alturaMax; altura > 0; altura--) {
            StringBuilder fila = new StringBuilder();
            for (int columna : alturas) {
                if (columna >= altura) {
                    fila.append("= ");
                } else {
                    fila.append("  ");
                }
            }
            System.out.println(fila);
        }

        // Imprime la base de las barras de sonido
        StringBuilder base = new StringBuilder();
        for (int i = 0; i < numBarras; i++) {
            base.append("= ");
        }
        System.out.println(base);
    }

}
