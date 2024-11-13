public class lenin {
    public void serie3(int nivel) {
        System.out.println("Serie numerica 3");
        int num1 = 0, num2 = 1, par = 1, num3;
        for (int fila = 1; fila <= nivel; fila++) {
            if (fila == 1) {
                System.out.print(num1 + "/" + par + " ");
            } else if (fila == 2) {
                System.out.print(num2 + "/" + (par + 2) + " ");
                par = par + 2;
            } else {
                par = par + 2;
                num3 = num1 + num2;
                System.out.print(num3 + "/" + par + " ");
                num1 = num2;
                num2 = num3;
            }
        }
        System.out.println();
    }

    public void ShowCaracteres6For(int numCaracteres) {
        for (int fila = 0; fila < numCaracteres; fila++) {
            char caracter = (char) (fila + 'a');
            System.out.print(caracter + " ");
        }
    }

    public void ShowCaracteres6dosFor(int numCaracteres) {
        for (int fila = 0; fila < (numCaracteres / 2); fila++) {
            char vocal = (char) ('a' + (fila * 2));
            System.out.print(vocal + " ");
            System.out.print((fila % 2 == 0) ? "+ " : "- ");
            // if (fila % 2 == 0) {
            // System.out.print("+ ");
            // } else {
            // System.out.print("- ");
            // }
        }
    }

    public void showCaracter7(int numCaracteres) {
        for (int fila = 1; fila <= numCaracteres; fila++) {
            char vocal = (char) ('a' + (fila - 1));
            String mLetra = Character.toString(vocal);
            System.out.print(mLetra.repeat(fila * 2) + " ");
        }
    }

    public void serNum6(int nivel) {
        for (int fila = 1; fila <= nivel; fila++) {
            System.out.print(fila * fila + " ");
        }
    }

    public void serNum7(int nivel) {
        int contador = 4, contador2 = 1;
        for (int fila = 1; fila <= nivel; fila++) {
            if (fila % 2 == 0) {
                System.out.print(contador + " ");
                contador = contador + 6;
            } else {
                System.out.print(contador2 + " ");
                contador2 = contador2 + 6;
            }
        }
    }

    public void serie4(int nivel) {
        System.out.println("Serie numerica 4");
        int num1 = 0, num2 = 1, par = 2, num3;
        for (int fila = 1; fila <= nivel; fila++) {
            if (fila == 1) {
                System.out.print(num1 + "/" + par + " ");
            } else if (fila == 2) {
                System.out.print(num2 + "/" + (par + 2) + " ");
                par = par + 2;
            } else {
                par = par + 2;
                num3 = num1 + num2;
                System.out.print(num3 + "/" + par + " ");
                num1 = num2;
                num2 = num3;
            }
        }
        System.out.println();
    }

    public void cadenaCaracter1(String nombre) {
        int contador = 0;
        String nombreMinuscula = nombre.toLowerCase();
        for (int fila = 0; fila < nombre.length(); fila++) {
            if ((nombreMinuscula.charAt(fila) == 'a') || (nombreMinuscula.charAt(fila) == 'e')
                    || (nombreMinuscula.charAt(fila) == 'i') || (nombreMinuscula.charAt(fila) == 'o')
                    || (nombreMinuscula.charAt(fila) == 'u')) {
                contador = contador + 1;
            }
        }
        System.out.println("Frase= " + nombre);
        System.out.println("Salida: tiene " + contador + " vocales");
    }

    public void cadenaCaracter2(String nombre) {
        int contador = 0;
        String nombreMinuscula = nombre.toLowerCase();
        for (int fila = 0; fila < nombre.length(); fila++) {
            if ((nombreMinuscula.charAt(fila) == 'a') || (nombreMinuscula.charAt(fila) == 'e')
                    || (nombreMinuscula.charAt(fila) == 'i') || (nombreMinuscula.charAt(fila) == 'o')
                    || (nombreMinuscula.charAt(fila) == 'u')) {
                contador = contador + 1;
            }
        }
        System.out.println("Frase= " + nombre);
        System.out.println("Salida: tiene " + (nombre.length() - contador) + " letras");
    }

    public void showCadenaCaracteres1(String frase) {
        int vocales = 0;
        char[] arregloVocales = { 'a', 'e', 'i', 'o', 'u' };
        for (int fila = 0; fila < frase.length(); fila++) {
            for (int j = 0; j < arregloVocales.length; j++) {
                if (frase.charAt(fila) == arregloVocales[j]) {
                    vocales++;
                }
            }
        }
        System.out.println("Hay: " + vocales + " vocales");
        System.out.println(" ");
    }

    public void cadenaCaracter3(String nombre, String vocal) {
        String nombreMinuscula = nombre.toLowerCase();
        String palabraSinVocal = nombreMinuscula.replaceAll(vocal, " ");
        System.out.println("Palabra inicial: " + nombre);
        System.out.println("vocal: " + vocal);
        System.out.println("salida: " + palabraSinVocal);
    }

    public void cadenaCaracter4(String frase, String letra) {
        String nombreMinuscula = frase.toLowerCase();
        String palabraSinVocal = nombreMinuscula.replaceAll(letra, " ");
        System.out.println("Palabra inicial: " + frase);
        System.out.println("vocal: " + letra);
        System.out.println("salida: " + palabraSinVocal);
    }

    public void showCadenaCaracteres5(String palabraOriginal) {
        StringBuilder palabraInvertida = new StringBuilder();
        for (int fila = palabraOriginal.length() - 1; fila >= 0; fila--) {
            char caracter = palabraOriginal.charAt(fila);
            if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u')) {
                palabraInvertida.append(Character.toUpperCase(caracter));
            } else {
                palabraInvertida.append(caracter);
            }
        }
        System.out.println("Palabra invertida: " + palabraInvertida);
    }

    public void showFrase5For(String frase) {
        char[] fraseCaracteres;
        fraseCaracteres = frase.toCharArray();
        System.out.println();
        for (int fila = fraseCaracteres.length - 1; fila >= 0; fila--) {
            if (fraseCaracteres[fila] == 'a' || fraseCaracteres[fila] == 'e' || fraseCaracteres[fila] == 'i'
                    || fraseCaracteres[fila] == 'o' || fraseCaracteres[fila] == 'u') {
                fraseCaracteres[fila] = Character.toUpperCase(fraseCaracteres[fila]);
                System.out.print(fraseCaracteres[fila]);
            } else
                System.out.print(fraseCaracteres[fila]);
        }
    }

    public void cadenaCaracter5(String frase) {
        char fraseNueva[] = frase.toCharArray();
        for (int fila = fraseNueva.length - 1; 0 <= fila; fila--) {
            if (fraseNueva[fila] == 'a' || fraseNueva[fila] == 'e' || fraseNueva[fila] == 'i' || fraseNueva[fila] == 'o'
                    || fraseNueva[fila] == 'u') {
                fraseNueva[fila] = Character.toUpperCase(fraseNueva[fila]);
                System.out.print(fraseNueva[fila]);
            } else {
                System.out.print(fraseNueva[fila]);
            }
        }
    }

    public void cadenaCaracter6(String frase) {
        char fraseNueva[] = frase.toCharArray();
        for (int fila = fraseNueva.length - 1; 0 <= fila; fila--) {
            if ((fraseNueva[fila] != 'a') || (fraseNueva[fila] != 'e') || (fraseNueva[fila] != 'i')
                    || (fraseNueva[fila] != 'o') || (fraseNueva[fila] != 'u')) {
                fraseNueva[fila] = Character.toUpperCase(fraseNueva[fila]);
                System.out.print(fraseNueva[fila]);
            } else {
                System.out.print(fraseNueva[fila]);
            }
        }
    }

    public void showFigura5For(int nroNiveles) {
        System.out.println();
        for (int filas = nroNiveles; filas > 0; filas--) {
            for (int espacio = nroNiveles; espacio > filas; espacio--) {
                System.out.print(" ");
            }
            for (int numCaracter = 0; numCaracter < filas; numCaracter++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Sirve para otras cosas que puden se rinteresantes
    public void g1_crearFigura4(int nivel, char caracter) {
        for (int fila = 0; fila < nivel; fila++) {
            for (int espacios = nivel; fila < espacios; espacios--) {
                System.out.print(".");
            }
            for (int numCaracter = 0; numCaracter < fila; numCaracter++) {
                System.out.print(caracter + " ");
            }
            System.out.println();
        }
    }

    // Este va para la muestra
    public void g1_crearFiguraCuatros(int nivel, char caracter) {
        for (int fila = 0; fila < nivel; fila++) {
            for (int espacio = 0; espacio < (nivel - fila - 1); espacio++) {
                System.out.print(" ");
            }
            for (int simbolo = 0; simbolo < (fila * 2) + 1; simbolo++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    public void g1_crearFigura5(int nivel, char caracter) {
        for (int fila = 0; fila < nivel; fila++) {
            for (int espacio = 0; espacio < fila; espacio++) {
                System.out.print(" ");
            }
            for (int simbolo = 0; simbolo < (nivel * 2 - (fila * 2) - 1); simbolo++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    public void g1_crearFigura12(int nivel, char caracter) {
        for (int fila = 0; fila < nivel; fila++) {
            for (int i = 0; i <= fila; i++) {
                System.out.print(caracter + " ");
            }
            System.out.println();
        }
    }

    public void g1_crearFigura122(int nivel) {
        for (int fila = 1; fila <= nivel; fila++) { // n=4 , for1: 1,2,3
            for (int i = 1; i <= fila; i++) { // for2:
                System.out.print(i); // imp 1,12
            }
            System.out.println();
        }
    }

    public void g1_crearFigura13(int nivel) {
        for (int fila = nivel; fila >= 1; fila--) { // n5 for1 5
            for (int i = 1; i <= fila; i++) { // for2 1,2,3,4,56
                System.out.print(i); // imprime:12345
            }
            System.out.println();
        }
    }

    public void showFigura15For(int nroNiveles) {
        for (int i = 0; i < nroNiveles; i++) {
            imprimirCoeficientes1(i);
            System.out.println();
        }
    }

    public void imprimirCoeficientes1(int rowNum) {
        for (int i = 0; i <= rowNum; i++) {
            System.out.print(calcularCoeficiente1(rowNum, i) + " ");
        }
    }

    public int calcularCoeficiente1(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return calcularCoeficiente1(n - 1, k - 1) + calcularCoeficiente1(n - 1, k);
        }
    }

    public void g1_crearFigura16(int nroNiveles) {
        System.out.println();
        for (int i = 1; i <= nroNiveles; i++) {
            for (int j = 1; j <= nroNiveles; j++) {
                if ((i == j || i + j == nroNiveles + 1)) {
                    if (i % 2 == 0) {
                        System.out.print(" " + '-' + " ");
                    } else {
                        System.out.print(" " + '+' + " ");
                    }
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    public void g1_crearCadena1(String frase) {

        int longitud = frase.length(), numeroVocales = 0;
        char[] caracter = new char[0];
        caracter = frase.toLowerCase().toCharArray();

        System.out.println("\nCadena Caracteres 1:");

        for (int i = 0; i < longitud; i++) {
            if (caracter[i] == 'a' || caracter[i] == 'e' || caracter[i] == 'i' || caracter[i] == 'o'
                    || caracter[i] == 'u') {
                numeroVocales++;
            }
        }

        System.out.println("La frase tiene " + numeroVocales + " vocales.");

    }

    public void showLoading2(Character caracter) {
        int longitudBarra = 20;
        int porcentaje = 0;
        while (porcentaje <= 100) {
            System.out.print("[");
            for (int i = 0; i < longitudBarra; i++) {
                if (i < (porcentaje * longitudBarra / 100)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%  ");
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

    public void g1_crearCadena6(String palabraOriginal) {
        StringBuilder palabraInvertida = new StringBuilder();
        for (int i = palabraOriginal.length() - 1; i >= 0; i--) {
            char caracter = palabraOriginal.charAt(i);
            if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u')) {
                palabraInvertida.append(caracter);
            } else {
                palabraInvertida.append(Character.toUpperCase(caracter));
            }
        }
        System.out.println("Palabra invertida: " + palabraInvertida);
    }

    public void showCadenaCaracteres7(String palabraOrigial) {
        palabraOrigial = palabraOrigial.toUpperCase();
        StringBuilder palabraAlterada = new StringBuilder();
        for (int i = 0; i < palabraOrigial.length(); i++) {
            if (palabraOrigial.charAt(i) != 'J') {
                palabraAlterada.append(palabraOrigial.charAt(i));
            }
        }
        System.out.println("Palabras sin J y Mayúsculas: " + palabraAlterada);
    }

    public void g1_crearFigura114(int nivel) {
        for (int filas = 0; filas < nivel; filas++) {
            for (int espacios = nivel; filas < espacios; espacios--) {
                System.out.print(" ");
            }
            int contador = 1;
            for (int j = 0; j <= filas; j++) {
                System.out.print(contador + " ");
                contador = contador * (filas - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public void g1_crearFigura15(int nivel) {
        for (int filas = 0; filas < nivel; filas++) {
            int contador = 1;
            for (int j = 0; j <= filas; j++) {
                System.out.print(contador + " ");
                contador = contador * (filas - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public void g1_crearFigura16Ac(int nroNiveles) {
        for (int i = 1; i <= nroNiveles; i++) {
            for (int j = 1; j <= nroNiveles; j++) {
                if (i == j || i + j == nroNiveles + 1) {
                    System.out.print(" " + (i % 2 == 0 ? '-' : '+') + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void g1_crearFigura17(int nivel) {
        for (int fila = 1; fila <= nivel; fila++) {
            for (int columna = 1; columna <= nivel; columna++) {
                if (fila == columna || (fila + columna) == nivel + 1) {
                    if (fila % 2 == 0) {
                        System.out.print("0" + " ");
                    } else {
                        System.out.print("1" + " ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imprimirPrimos(int cantidad) {
        System.out.println("Serie Numerica 5: ");
        int contadorPrimos = 0;
        int numero = 2;
        while (contadorPrimos < cantidad) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contadorPrimos++;
            }
            numero++;
        }
    }

    public void g1_crearSerie5(int numTerminos) {
        System.out.println("Serie Numerica 5:");
        for (int cont = 0, termino = 2; cont < numTerminos; termino++) {
            if (esPrimo(termino)) {
                System.out.print(termino + " ");
                cont++;
            }
        }
        System.out.println();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void g1_crearSerieCaracter8(int numTerminos) {
        System.out.println("Serie Caracter 8: ");
        for (int cont = 0, termino = 2, abecedario = 0; cont < numTerminos; termino++) {
            if (esPrimo(termino)) {
                char letra = (char) ('a' + abecedario);
                System.out.print(String.valueOf(letra).repeat(termino) + " ");
                abecedario++;
                cont++;
            }
        }
        System.out.println();
    }

    public void showArrays1(String[] nombreCompleto, int[] porcentajes){
        for (int i=0 ; i<nombreCompleto.length;i++) {
            StringBuilder barra = new StringBuilder("[");
            int tamañoBarra = (int)(porcentajes[i]/5);
            for(int j = 0; j<tamañoBarra; j++){
                barra.append("=");
            }
            barra.append(">");
            for(int j = tamañoBarra; j<20; j++){
                barra.append(" ");
            }
            int fin = (int)((porcentajes[i]/10));
            barra.append("] ").append(porcentajes[i]).append("% ").append(nombreCompleto[i].substring(0, ((fin>nombreCompleto[i].length()) ? nombreCompleto[i].length(): fin )));
            System.out.println(barra);
        }
    }

    public void showArrays11(String[] nombreCompleto, int[] porcentajes) {
        for (int i = 0; i < nombreCompleto.length; i++) {
            int tamañoBarra = porcentajes[i] / 5;
            
            // Construye la barra de progreso con "=" y ">"
            String barra = "[" + "=".repeat(tamañoBarra) + ">";
            
            // Rellena el resto de la barra hasta 20 caracteres con espacios
            barra += " ".repeat(20 - tamañoBarra) + "]";
            
            int fin = Math.min(porcentajes[i] / 10, nombreCompleto[i].length());
            
            // Muestra la barra con el porcentaje y la parte del nombre
            System.out.printf("%s %d%% %s%n", barra, porcentajes[i], nombreCompleto[i].substring(0, fin));
        }
    }
    

}