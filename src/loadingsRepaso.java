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

    public void loadingMultiple(String[] nombres, int[] porcentajes) {
        if (nombres.length != 4 || porcentajes.length != 4) {
            System.out.println("Debe ingresar exactamente 4 nombres y 4 porcentajes.");
            return;
        }

        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            int porcentaje = porcentajes[i];
            int longitudBarra = 20; // Tamaño de la barra de progreso
            // Calcular cuántos símbolos de progreso ">" mostrar según el porcentaje
            int progreso = (porcentaje * longitudBarra) / 100;
            // Mostrar la barra de progreso para el nombre actual
            try {
                Thread.sleep(250);
            } catch (Exception e) {
                e.printStackTrace();
            }
            String barraProgreso = "=".repeat(progreso) + " ".repeat(longitudBarra - progreso);
            System.out.printf("[%s] %3d%% %s\n", barraProgreso, porcentaje, nombre);
        }
    }

    public void loadingMultiple2(String[] nombres, int[] porcentajes) {
        if (nombres.length != 4 || porcentajes.length != 4) {
            System.out.println("Debe ingresar exactamente 4 nombres y 4 porcentajes.");
            return;
        }
        int longitudBarra = 20; // Tamaño de la barra de progreso
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            int porcentaje = porcentajes[i];
            // Calcular cuántos símbolos "=" mostrar y añadir ">" al final del progreso
            int progreso = (porcentaje * longitudBarra) / 100;
            String barraProgreso = "=".repeat(progreso)
                    + ">"
                    + " ".repeat(longitudBarra - progreso - 1);
            // Mostrar la barra de progreso para el nombre actual
            System.out.printf("[%s] %3d%% %s\n", barraProgreso, porcentaje, nombre);
            try {
                Thread.sleep(250);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void loadingMultiple3(String[] nombres, int[] porcentajes) {
        if (nombres.length != 4 || porcentajes.length != 4) {
            System.out.println("Debe ingresar exactamente 4 nombres y 4 porcentajes.");
            return;
        }
        int longitudBarra = 20; // Tamaño de la barra de progreso
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            int porcentaje = porcentajes[i];
            // Calcular cuántos símbolos "=" mostrar y añadir ">" al final del progreso
            int progreso = (porcentaje * longitudBarra) / 100;
            StringBuilder barraProgreso = new StringBuilder();
            // Construir la parte de progreso con "="
            for (int j = 0; j < progreso; j++) {
                barraProgreso.append("=");
            }
            // Añadir el símbolo ">"
            if (progreso < longitudBarra) {
                barraProgreso.append(">");
            }
            // Completar la barra con espacios
            for (int j = progreso + 1; j < longitudBarra; j++) {
                barraProgreso.append(" ");
            }
            // Mostrar la barra de progreso para el nombre actual
            System.out.printf("[%s] %3d%% %s\n", barraProgreso.toString(), porcentaje, nombre);
        }
    }

    public void generarMatrizAleatoria(String[] nombres) throws InterruptedException {
        int filas = nombres[0].length(); // Tamaño de la matriz según el primer nombre
        char[][] matriz = new char[filas][filas];
        Random random = new Random();

        // Llenamos inicialmente la matriz con espacios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Colocar letras aleatorias de cada nombre en la matriz
        for (String nombre : nombres) {
            for (char letra : nombre.toCharArray()) {
                int x, y;
                do {
                    x = random.nextInt(filas);
                    y = random.nextInt(filas);
                } while (matriz[x][y] != ' '); // Buscar posición vacía

                matriz[x][y] = letra;
                mostrarMatriz(matriz); // Visualizar el proceso
                Thread.sleep(500); // Delay de 500ms
            }
        }
    }

    // Método para mostrar la matriz
    private void mostrarMatriz(char[][] matriz) {
        for (char[] fila : matriz) {
            for (char elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void mostrarBarra(String nombre1, String nombre2, String nombre3, String nombre4, int num1, int num2,
            int num3, int num4) {
        int longitudBarra = 20; // Tamaño de la barra de progreso
        // Llamada a la función auxiliar para cada nombre y porcentaje
        generarBarra(nombre1, num1, longitudBarra);
        generarBarra(nombre2, num2, longitudBarra);
        generarBarra(nombre3, num3, longitudBarra);
        generarBarra(nombre4, num4, longitudBarra);
    }

    private void generarBarra(String nombre, int porcentaje, int longitudBarra) {
        int progreso = (porcentaje * longitudBarra) / 100; // Calcular progreso en función del porcentaje
        String barraProgreso = "=".repeat(progreso) + " ".repeat(longitudBarra - progreso);

        // Mostrar la barra de progreso para el nombre y porcentaje
        System.out.printf("[%s] %3d%% %s\n", barraProgreso, porcentaje, nombre);
    }

}
