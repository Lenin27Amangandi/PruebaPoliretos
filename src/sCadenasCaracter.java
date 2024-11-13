public class sCadenasCaracter {

    public void cadenaCaracter1(String nombre) {
        System.out.println("Cadena 1");
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
        System.out.println("Cadena 2");

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

    public void cadenaCaracter3(String nombre, String vocal) {
        System.out.println("Cadena 3");
        String nombreMinuscula = nombre.toLowerCase();
        String palabraSinVocal = nombreMinuscula.replaceAll(vocal, " ");
        System.out.println("Palabra inicial: " + nombre);
        System.out.println("vocal: " + vocal);
        System.out.println("salida: " + palabraSinVocal);
    }

    public void cadenaCaracter4(String frase, String letra) {
        System.out.println("Cadena 4");
        String nombreMinuscula = frase.toLowerCase();
        String palabraSinVocal = nombreMinuscula.replaceAll(letra, " ");
        System.out.println("Palabra inicial: " + frase);
        System.out.println("vocal: " + letra);
        System.out.println("salida: " + palabraSinVocal);
    }

    public void cadenaCaracter5(String frase) {
        System.out.println("Cadena 5");
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

    public void cadenaCaracter6(String frase) {
        System.out.println("Cadena 6");
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

}
