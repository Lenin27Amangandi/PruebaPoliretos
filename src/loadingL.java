import java.util.Random;

public class loadingL {

    public void loading1() {
        System.out.println("Loading 1");
        String charge[] = { "|", "/", "-", "\\" };
        for (int i = 1; i <= 100; i++) {
            System.out.print("\r" + charge[i % charge.length] + " " + i + "%");
            try {
                Thread.sleep(50);
            } catch (InterruptedException ie) {
            }
        }
        System.out.println();
    }

    public void loading2(char caracter) {
        System.out.println("Loading 2: ");
        int longitudTotal = 20;
        for (int i = 0; i <= longitudTotal; i++) {
            String barraCargada = String.valueOf(caracter).repeat(i);
            String barraEspacios = " ".repeat(longitudTotal - i);
            int porcentaje = (i * 100) / longitudTotal;
            System.out.print("\r[" + barraCargada + barraEspacios + "] " + porcentaje + "%");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void loading3(char caracter) {
        System.out.println("Loading 3: ");
        int porcentaje, longitudBarra = 20;
        String barrAnterios, barraposterior;
        for (int i = 0; i < longitudBarra; i++) {
            barrAnterios = " ".repeat(i);
            barraposterior = " ".repeat(longitudBarra - i - 1);
            porcentaje = ((i + 1) * 100 / longitudBarra);
            System.out.print("\r[" + barrAnterios + caracter + barraposterior + "] " + porcentaje + " %");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }


    public void loading4() {
        System.out.println("Loading 4");
        String cadena[] = { "0oo", "o0o", "oo0" };
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + cadena[i % cadena.length] + " " + i + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
            }
        }
        System.out.println();
    }

    public static void loading5() throws InterruptedException {
        System.out.println("Loading 5");
        String[] simbolos = { ">", "-" };
        int longitudBarra = 20;
        int tiempoEspera = 100;
        for (int i = 1; i <= longitudBarra; i++) {
            String simboloRotativo = simbolos[i % simbolos.length];
            String progreso = "=".repeat(i) + simboloRotativo + " ".repeat(longitudBarra - i);
            int porcentaje = (i * 100) / longitudBarra;
            System.out.print("\r[" + progreso + "] " + porcentaje + "%");
            Thread.sleep(tiempoEspera);
        }
        System.out.println();
    }

    public static void loading7() {
        System.out.println("Loading 7: ");
        String[] simbolos = { "\\", "|", "/", "-" };
        int longitudBarra = 20;
        int tiempoEspera = 100;
        for (int i = 0; i <= longitudBarra; i++) {
            String simboloRotativo = simbolos[i % simbolos.length];
            String progreso = "=".repeat(i) + simboloRotativo + " ".repeat(longitudBarra - i);
            int porcentaje = (i * 100) / longitudBarra;
            System.out.print("\r[" + progreso + "] " + porcentaje + "%");
            try {
                Thread.sleep(tiempoEspera);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void loading8(String nombreCompleto) {
        System.out.println("Loading 8: ");
        String barraEspacios;
        int porcentaje;
        for (int i = 0; i <= nombreCompleto.length(); i++) {
            barraEspacios = " ".repeat(nombreCompleto.length() - i);
            porcentaje = (i * 100) / nombreCompleto.length();
            System.out.print("\r[" + nombreCompleto.substring(0, i) + barraEspacios + "]" + porcentaje + "%");
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void loading10(String nombreArchivo) {
        System.out.println("Loading 10: ");
        Random random = new Random();
        int tamañoArchivo = random.nextInt(91) + 10;
        double tamañoActual = 0;
        int longitudBarra = 20;
        
        System.out.println("Downloading " + nombreArchivo + " (" + tamañoArchivo + " kB)");

        while (tamañoActual < tamañoArchivo) {
            // Simular la carga incrementando el tamaño actual
            tamañoActual += random.nextDouble() * 5; // Incremento aleatorio entre 0 y 5 kB
            if (tamañoActual > tamañoArchivo) {
                tamañoActual = tamañoArchivo; // No superar el tamaño del archivo
            }
            // Calcular el progreso
            int progreso = (int) (tamañoActual * longitudBarra / tamañoArchivo);
            double porcentaje = (tamañoActual / tamañoArchivo) * 100;
            // Construir la barra de carga
            String barraCarga = "█".repeat(progreso) + " ".repeat(longitudBarra - progreso);
            // Imprimir la barra de carga en color
            System.out.print("\r" + "\033[32m" + barraCarga + "\033[0m " + String.format("%.1f", tamañoActual) + " / "
                    + tamañoArchivo + " kB");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("Descarga completa!");
        System.out.println();
    }

    public void loading11(int nivel) {
        System.out.println("Loading 11.1; ");
        int numRandom;
        int espacio;
        String simbolo = "-";
        System.out.println();
        for (int i = 0; i < nivel; i++) {
            numRandom = (int) (Math.random() * 10);
            espacio = 10 - numRandom;
            // System.out.println(numRandom + " ".repeat(espacio) + "\033[32m" + simbolo.repeat(numRandom) + "|"
            //         + simbolo.repeat(numRandom));
            System.out.println(numRandom + " ".repeat(espacio) + simbolo.repeat(numRandom) + "|"
                    + simbolo.repeat(numRandom));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void loading11D() {
        System.out.println("Loading 11.1: ");
        int numColumnas = 15;
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
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < alturasRandosm.length; i++) {
            System.out.print("* ");
        }
    System.out.println();
    }


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
}
