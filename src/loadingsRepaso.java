import java.util.Random;

public class loadingsRepaso {

    public void loading1() {
        System.out.println("Loading 1");
        String charge[] = { "|", "/", "-", "\\" };
        for (int i = 1; i <= 100; i++) {
            System.out.print("\r" + charge[i % 4] + " " + i + "%");
            try {
                Thread.sleep(50);
            } catch (InterruptedException ie) {
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

    public void showLoading7() {
        String[] caracter = { "\\", "|", "/", "-" };
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            int numIguales = i / 5;
            int numEspacios = 20 - numIguales;
            // Construimos la barra manualmente usando StringBuilder
            StringBuilder barra = new StringBuilder();
            // Añadimos los signos "="
            for (int j = 0; j < numIguales; j++) {
                barra.append("=");
            }
            // Añadimos el símbolo del puntero animado
            barra.append(caracter[i % caracter.length]);
            // Añadimos los espacios restantes
            for (int j = 0; j < numEspacios; j++) {
                barra.append(" ");
            }
            // Imprimimos la barra de progreso con el porcentaje actual
            System.out.print("\r[" + barra + "] " + i + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void loading2(char caracter) {
        System.out.println("Loading 2: ");
        int longitudTotal = 20; // Longitud total de la barra de carga
        for (int i = 0; i <= longitudTotal; i++) {
            // Construimos la parte de la barra que está "cargada" con "="
            String barraCargada = String.valueOf(caracter).repeat(i);
            // Calculamos el número de espacios que quedan para completar la longitud total
            String barraEspacios = " ".repeat(longitudTotal - i);
            // Imprimimos la barra de carga con el progreso en porcentaje
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

    public void loading8(String nombreCompleto) {
        System.out.println("Loading 8: ");
        String barraEspacios;
        int porcentaje;
        for (int i = 0; i <= nombreCompleto.length(); i++) {
            barraEspacios = " ".repeat(nombreCompleto.length() - i);
            porcentaje = (i * 100) / nombreCompleto.length();
            System.out.print("\r[" + nombreCompleto.substring(0, i) + barraEspacios + "]" + porcentaje + "%");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void loading3(char caracter) {
        System.out.println("Figura N 3: ");
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

    public void loading5() {
        System.out.println("Figura N 5: ");
        int longitudBarra = 20; // Longitud total de la barra de carga
        for (int i = 0; i <= longitudBarra; i++) {
            // Construimos la parte de la barra que está "cargada" con "="
            String barraCargada = "=".repeat(i);
            // Calculamos el número de espacios que quedan para completar la longitud total
            String barraEspacios = " ".repeat(longitudBarra - i);
            // Calculamos el porcentaje
            int porcentaje = (i * 100) / longitudBarra;
            // Definimos el carácter al final de la barra: '>' en posiciones impares, '-' en
            // posiciones pares
            char punta;
            if (i == longitudBarra) {
                punta = ' '; // Espacio al final cuando la barra está llena
            } else {
                punta = (i % 2 == 0) ? '-' : '>'; // '-' en pares, '>' en impares
            }
            // Imprimimos la barra de carga con el progreso en porcentaje
            System.out.print("\r[" + barraCargada + punta + barraEspacios + "] " + porcentaje + "%");
            // Pausamos para que se vea la animación
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Salto de línea al terminar la barra de carga
        System.out.println();
    }

    public void loading5Dinamico() {
        System.out.println("Figura N 5: ");
        int longitudBarra = 20;
        for (int i = 0; i <= longitudBarra; i++) {
            // Construimos la parte de la barra que está "cargada" con "="
            String barraCargada = "=".repeat(i);
            // Calculamos el número de espacios que quedan para completar la longitud total
            String barraEspacios = " ".repeat(longitudBarra - i);
            // Calculamos el porcentaje
            int porcentaje = (i * 100) / longitudBarra;
            // Definimos el carácter al final de la barra: '>' en posiciones impares, '-' en
            // posiciones pares
            char punta;
            if (i < longitudBarra) {
                punta = (i % 2 == 0) ? '-' : '>'; // '-' en pares, '>' en impares
            } else {
                // Para la última posición, asignamos el carácter de la última posición
                punta = (longitudBarra % 2 == 0) ? '-' : '>'; // Último carácter en función de la longitud
            }
            // Imprimimos la barra de carga con el progreso en porcentaje
            System.out.print("\r[" + barraCargada + punta + barraEspacios + "] " + porcentaje + "%");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void loading10(String nombreArchivo) {
        Random random = new Random();
        int tamañoArchivo = random.nextInt(91) + 10; // Genera un número entre 10 y 100
        double tamañoActual = 0;
        int longitudBarra = 20;
        System.out.println("loading 10; ");
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
            // Pausa para simular el tiempo de carga
            try {
                Thread.sleep(300); // Espera 300 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("Descarga completa!");
        System.out.println();
    }

}
