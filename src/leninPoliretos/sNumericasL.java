package leninPoliretos;

public class sNumericasL {

    public void serie1(Integer nivel) {
        System.out.println("Serie numerica 1");
        Integer num1 = 0, num2 = 1, num3;
        for (int i = 0; i < nivel; i++) {
            if (i == 0) {
                System.out.print(num1 + " ");
            } else if (i == 1) {
                System.out.print(num2 + " ");
            } else {
                num3 = num1 + num2;
                System.out.print(num3 + " ");
                num1 = num2;
                num2 = num3;
            }
        }
        System.out.println();
    }

    public void serie2(Integer nivel) {
        System.out.println("Serie numerica 2");
        for (int i = 1; i <= nivel; i++)
            System.out.print((i % 2 == 0) ? "0" + " " : i + " ");
        System.out.println();
    }

    public void serie3(int nivel) {
        System.out.println("Serie numerica 3");
        int num1 = 0, num2 = 1, impar = 1, num3;
        for (int i = 1; i <= nivel; i++) {
            if (i == 1) {
                System.out.print(num1 + "/" + impar + " ");
            } else if (i == 2) {
                System.out.print(num2 + "/" + (impar + 2) + " ");
                impar = impar + 2;
            } else {
                impar = impar + 2;
                num3 = num1 + num2;
                System.out.print(num3 + "/" + impar + " ");
                num1 = num2;
                num2 = num3;
            }
        }
        System.out.println();
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

    public void serNum6(int nivel) {
        System.out.println("Serie numerica 6");
        for (int fila = 1; fila <= nivel; fila++) {
            System.out.print(fila * fila + " ");
        }
    }

    public void serNum7(int nivel) {
        int numImprimir = 1;
        System.out.println("Serie numerica 7");
        for (int i = 1; i <= nivel; i++) {
            System.out.print(numImprimir + " ");
            numImprimir=numImprimir+3;
        }
        // int contador = 4, contador2 = 1;
        // for (int fila = 1; fila <= nivel; fila++) {
        //     if (fila % 2 == 0) {
        //         System.out.print(contador + " ");
        //         contador = contador + 6;
        //     } else {
        //         System.out.print(contador2 + " ");
        //         contador2 = contador2 + 6;
        //     }
        // }
    }

    public void serie1M(Integer nivel) {
        System.out.println("Serie numerica 1Modificada");
        Integer num1 = 0, num2 = 1, num3;
        for (int i = 0; i < nivel; i++) {
            System.out.print(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
    }


    public static void serie5(int cantidad) {
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

    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++)
            if (numero % i == 0)
            return false;
        return true;
    }
}
