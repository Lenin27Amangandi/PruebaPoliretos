import java.util.Random;

public class theLatDance {

    public static void generarBarrasDeSonido(int numBarras, int alturaMax) {
        Random random = new Random();
        int[] alturas = new int[numBarras];
        // Genera alturas aleatorias para cada barra
        for (int i = 0; i < numBarras; i++) {
            alturas[i] = random.nextInt(alturaMax + 1); // Altura entre 0 y alturaMax
            System.out.print(alturas[i] + " ");
        }
        // Construye la visualización de las barras de sonido
        for (int nivel = alturaMax; nivel > 0; nivel--) {
            for (int altura : alturas) {
                // Imprime "≡ " si la altura de la barra alcanza el nivel actual, de lo
                // contrario, imprime espacios
                System.out.print(altura >= nivel ? "* " : "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < numBarras; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public void loading11_() {
        int numColumnas = 10;
        // ObjetoRamdon para los valores aleatorios
        Random ramdom = new Random();
        // Una altura para cada columna
        int alturasRandosm[] = new int[numColumnas];

        for (int i = 0; i < alturasRandosm.length; i++) {
            alturasRandosm[i] = ramdom.nextInt(8);
            System.out.print(alturasRandosm[i] + " ");
        }

        for (int nivel = 8; 0 < nivel; nivel--) {
            for (int altura : alturasRandosm) {
                if (altura >= nivel) {
                    System.out.print("= ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < alturasRandosm.length; i++) {
            System.out.print("= ");
        }
    }

    public void g2_array0555() {
        System.out.print("\n- Serie A05.\n");

        String nombreCompleto = "Lenin Amangandi Alexander LLumiguano"; // Frase de ejemplo
        String[] palabras = nombreCompleto.split(" ");
        String primerPalabra = palabras[0];
        int tamanoMatriz = primerPalabra.length();
        char[][] matriz = new char[tamanoMatriz][tamanoMatriz];


        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Rellenar la matriz con las letras de la primera palabra
        for (int k = 0; k < palabras.length; k++) {
            primerPalabra = palabras[k];
            for (char letra : primerPalabra.toCharArray()) {
                int x, y;
                x = (int) (Math.random() * tamanoMatriz);
                y = (int) (Math.random() * tamanoMatriz);
                if (matriz[x][y] != ' ') {
                    matriz[x][y] = '*';
                } else {
                    matriz[x][y] = letra;
                }
            }
        }

        // Mostrar la matriz con un pequeño retraso entre cada impresión
        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                // Imprimir cada carácter con un pequeño retraso
                System.out.print(matriz[i][j] + " ");
                try {
                    Thread.sleep(300); // Retraso de 100 milisegundos
                } catch (InterruptedException e) {
                    e.printStackTrace(); // Manejo de la excepción si ocurre
                }
            }
            // Salto de línea al final de cada fila
            System.out.println();
        }
        System.out.println(" ");
    }

    public static void mostrarBarraProgreso() throws InterruptedException {
        String[] simbolos = { "\\", "|", "/", "-" };
        int longitudBarra = 20;
        int tiempoEspera = 200;
        for (int i = 0; i <= longitudBarra; i++) {
            String simboloRotativo = simbolos[i % simbolos.length];
            String progreso = "=".repeat(i) + simboloRotativo + " ".repeat(longitudBarra - i);
            int porcentaje = (i * 100) / longitudBarra;
            System.out.print("\r[" + progreso + "] " + porcentaje + "%");
            Thread.sleep(tiempoEspera);
        }
        System.out.println();
    }

    public static void mostrarBarraProgreso2222() throws InterruptedException {
        String[] simbolos = { ">", "-" };
        int longitudBarra = 20;
        int tiempoEspera = 500;
        for (int i = 1; i <= longitudBarra; i++) {
            // Símbolo rotatorio, cambia en cada iteración
            String simboloRotativo = simbolos[i % simbolos.length];
            // Construcción de la barra de progreso
            String progreso = "=".repeat(i) + simboloRotativo + " ".repeat(longitudBarra - i);
            // Cálculo del porcentaje
            int porcentaje = (i * 100) / longitudBarra;
            // Imprime la barra de progreso con el porcentaje
            System.out.print("\r[" + progreso + "] " + porcentaje + "%");
            Thread.sleep(tiempoEspera);
        }
    }

    public static void mostrarBarraDesplazamiento() throws InterruptedException {
        String simbolo = "<=>";
        int longitudBarra = 20;
        int tiempoEspera = 500;
        int simboloLongitud = simbolo.length();

        for (int i = 0; i <= longitudBarra - simboloLongitud; i++) {
            // Construcción de la barra con el símbolo desplazado
            String espacioIzquierda = " ".repeat(i);
            String espacioDerecha = " ".repeat(longitudBarra - simboloLongitud - i);
            String progreso = "[" + espacioIzquierda + simbolo + espacioDerecha + "]";

            // Cálculo del porcentaje basado en la posición del símbolo
            int porcentaje = (i * 100) / (longitudBarra - simboloLongitud);

            // Imprime la barra de desplazamiento con el porcentaje
            System.out.print("\r" + progreso + " " + porcentaje + "%");

            // Pausa para simular el movimiento
            Thread.sleep(tiempoEspera);
        }

        // Al finalizar, muestra la barra completa al 100%
        // System.out.print("\r[" + " ".repeat(longitudBarra - simboloLongitud) +
        // simbolo + "] 100%\n");
        System.out.println();
    }

    public static void mostrarBarraDesplazamiento14() throws InterruptedException {
        String simbolo = "<=>";
        int simboloLongitud = simbolo.length();
        int longitudBarra = 20;
        int tiempoEspera = 500;

        boolean moverDerecha = true; // Variable para alternar la dirección

        for (int i = 0; i <= 10; i++) { // 10 porque vamos a mover la barra en incrementos de 10%
            // int porcentaje = i * 10;
            int porcentaje = i;
            // Dependiendo de si moverDerecha es verdadero o falso, ajustamos la dirección
            if (moverDerecha) {
                // Movimiento de izquierda a derecha
                for (int j = 0; j <= longitudBarra - simboloLongitud; j++) {
                    String espacioIzquierda = " ".repeat(j);
                    String espacioDerecha = " ".repeat(longitudBarra - simboloLongitud - j);
                    String progreso = "[" + espacioIzquierda + simbolo + espacioDerecha + "]";
                    System.out.print("\r" + progreso + " " + porcentaje + "%");
                    Thread.sleep(tiempoEspera);
                }
            } else {
                // Movimiento de derecha a izquierda
                for (int j = longitudBarra - simboloLongitud; j >= 0; j--) {
                    String espacioIzquierda = " ".repeat(j);
                    String espacioDerecha = " ".repeat(longitudBarra - simboloLongitud - j);
                    String progreso = "[" + espacioIzquierda + simbolo + espacioDerecha + "]";

                    System.out.print("\r" + progreso + " " + porcentaje + "%");
                    Thread.sleep(tiempoEspera);
                }
            }

            // Alterna la dirección
            moverDerecha = !moverDerecha;
        }

        // Al finalizar, muestra la barra completa al 100%
        System.out.print("\r[" + " ".repeat(longitudBarra - simboloLongitud) + simbolo + "] 100%\n");
    }

    public static void mostrarBarraProgreso142() throws InterruptedException {
        int longitudBarra = 20;
        int tiempoEspera = 100;
        String simbolo = "<=>";
        int simboloLongitud = simbolo.length();
        // Bucle principal para controlar el avance de la barra
        for (int i = 1; i <= 100; i++) { // Se va de 1% a 100%
            int porcentaje = i; // Porcentaje de progreso

            // Calcular el número de espacios que se deben agregar a la barra según el
            // porcentaje
            int espacios = (int) ((longitudBarra - simboloLongitud) * (i / 100.0));
            String espaciosIzquierda = " ".repeat(espacios);
            String espaciosDerecha = " ".repeat(longitudBarra - simboloLongitud - espacios);

            // Formar la barra con el símbolo y los espacios calculados
            String barra = "[" + espaciosIzquierda + simbolo + espaciosDerecha + "]";

            // Mostrar la barra de progreso con el porcentaje
            System.out.print("\r" + barra + " " + porcentaje + "%");
            Thread.sleep(tiempoEspera); // Esperar el tiempo de simulación
        }

        // Al finalizar, muestra la barra completa al 100%
        System.out.print("\r[" + " ".repeat(longitudBarra - simboloLongitud) + simbolo + "] 100%\n");
    }



}
