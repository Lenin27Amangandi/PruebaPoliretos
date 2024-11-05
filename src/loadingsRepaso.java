public class loadingsRepaso {

    public void loading1() {
        int totalPasos = 100;
        for (int i = 0; i <= totalPasos; i++) {
            int porcentaje = i;
            String indicador = obtenerIndicadorRotacional(i);
            System.out.print("\rCargando: " + indicador + " " + porcentaje + "% ");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n¡Carga completa!");
    }

    public static String obtenerIndicadorRotacional(int paso) {
        String[] rotacion = { "|", "/", "-", "\\" };
        return rotacion[paso % rotacion.length];
    }

    public void showLoading1() {
        String charge[] = { "|", "/", "-", "\\" };
        for (int i = 1; i <= 100; i++) {
            System.out.print(charge[i % 4] + " " + i + "%");
            try {
                Thread.sleep(300);
            } catch (InterruptedException ie) {
            }
        }
        System.out.println();
    }

    public void loading4() {
        String cadena[] = { "0oo", "o0o", "oo0" };
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + cadena[i % cadena.length] + " " + i + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
            }
        }
    }

    public void loading2() {
        int cadenaLongitud = 20;
        int porcentaje = 0;
        String caracter = "*";

        while (porcentaje <= 100) {
            System.out.print("[");

            for (int i = 0; i < cadenaLongitud; i++) {
                if (i == (porcentaje * cadenaLongitud / 100)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("\r");
            porcentaje++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void loading2222() {
        char caracter = 'a';
        int totalPasos = 20;
        for (int i = 0; i <= totalPasos; i++) {
            int porcentaje = (i * 100) / totalPasos;
            int longitudBarra = i;
            String barra = generarBarraCarga(caracter, longitudBarra);
            System.out.print("\r[" + barra);
            System.out.print("] " + porcentaje + "% ");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n¡Carga completa!");
    }

    public static String generarBarraCarga(char caracter, int longitud) {
        StringBuilder barra = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            barra.append(caracter);
        }
        return barra.toString();
    }

    public static void loadingPrueba() {
        int cadenaTamaño = 20;
        System.out.print("[");
        for (int i = 0; i <= 100; i++) {
            int numberOfStars = (i * cadenaTamaño) / 100;

            for (int j = 0; j < numberOfStars; j++) {
                System.out.print("*");
            }

            for (int j = numberOfStars; j < cadenaTamaño; j++) {
                System.out.print(" ");
            }
            System.out.print("] " + i + "%");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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

    public void BarraCarga(char caracter) {
        System.out.println("Loading 2: ");
        int longitudTotal = 20; // Longitud total de la barra de carga
        for (int i = 0; i <= longitudTotal; i++) {
            // Construimos la parte de la barra que está "cargada" con "="
            // String barraCargada = "=".repeat(i);
            String barraCargada = String.valueOf(caracter).repeat(i);
            // Calculamos el número de espacios que quedan para completar la longitud total
            String barraEspacios = " ".repeat(longitudTotal - i);
            // Imprimimos la barra de carga con el progreso en porcentaje
            int porcentaje = (i * 100) / longitudTotal;
            System.out.print("\r[" + barraCargada + barraEspacios + "] " + porcentaje + "%");
            // Pausamos para que se vea la animación
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Salto de línea al terminar la barra de carga
        System.out.println();
    }

    // public void NombreAnimacion() {
    // String nombre = "LeviAckermas"; // Nombre a imprimir
    // int longitudTotal = 12; // Longitud total del espacio de la barra
    // for (int i = 0; i <= nombre.length(); i++) {
    // // Construimos la parte visible del nombre hasta la letra actual
    // String visible = nombre.substring(0, i);
    // // Calculamos los espacios restantes para completar la longitud total
    // String espacios = " ".repeat(longitudTotal - i);
    // // Calculamos el porcentaje de progreso
    // int porcentaje = (i * 100) / nombre.length();
    // // Imprimimos el estado actual de la animación
    // System.out.print("\r[" + visible + espacios + "] " + porcentaje + "%");
    // // Pausamos para que se vea la animación
    // try {
    // Thread.sleep(100);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // }
    // System.out.println();
    // }

    public void NombreAnimacion(String nombreCompleto) {
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

    public void SimulacionMovimiento() {
        int longitudTotal = 20; // Longitud fija de la barra
        for (int i = 0; i < longitudTotal; i++) {
            // Espacios antes y después del carácter `-`
            String espaciosAntes = " ".repeat(i);
            String espaciosDespues = " ".repeat(longitudTotal - i - 1);
            // Calculamos el porcentaje de progreso
            int porcentaje = (i * 100) / (longitudTotal - 1);
            // Imprimimos el estado actual de la animación
            System.out.print("\r[" + espaciosAntes + "-" + espaciosDespues + "] " + porcentaje + "%");
            // Pausamos para que se vea la animación
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Salto de línea al terminar
        System.out.println();
    }

    public void SimulacionMovimiento2(char caracter) {
        System.out.println("Figura N 3: ");
        int porcentaje, longitudBarra = 20;
        String barrAnterios, barraposterior;
        for (int i = 0; i < longitudBarra; i++) {
            barrAnterios = " ".repeat(i);
            barraposterior = " ".repeat(longitudBarra - i - 1);
            porcentaje = (i * 100 / longitudBarra - 1);
            System.out.print("\r[" + barrAnterios + caracter + barraposterior + "] " + porcentaje + " %");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}
