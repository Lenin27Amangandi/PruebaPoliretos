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
        String nombreCompleto = "Levi Ackerman"; // Leer nombre completo

        // Obtener la longitud del nombre para calcular el porcentaje
        int longitudNombre = nombreCompleto.length();

        // Determinar el espacio máximo para alinear los porcentajes
        int maxLongitud = longitudNombre * 2; // Asumimos que el espacio máximo es dos veces la longitud del nombre

        // Mostrar cada letra con su porcentaje de avance
        for (int i = 0; i < longitudNombre; i++) {
            // Calcular el porcentaje
            int porcentaje = (i + 1) * 100 / longitudNombre;

            // Obtener la letra actual
            char letra = nombreCompleto.charAt(i);

            // Espacios antes de la letra para que avance de izquierda a derecha
            String espacios = " ".repeat(i);

            // Crear la cadena de porcentaje con el formato correcto
            String porcentajeStr = porcentaje + "%";

            // Asegurar que el porcentaje esté alineado al final
            String espaciosParaPorcentaje = " ".repeat(maxLongitud - (espacios.length() + 1 + porcentajeStr.length()));

            // Imprimir la letra con el porcentaje alineado al final
            System.out.println(espacios + letra + espaciosParaPorcentaje + porcentajeStr);

            // Esperar un poco para hacer la animación más visible
            esperar(150); // Retraso de 150 ms
        }
    }
}
