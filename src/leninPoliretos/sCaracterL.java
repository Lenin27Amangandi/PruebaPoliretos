package leninPoliretos;

public class sCaracterL {

    public void serieCaracter4(int nivel) {
        System.out.println("Serie caracter 4");
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
        System.out.println();
    }

    public void serieCaracter5(int nivel) {
        System.out.println("Serie caracter 5");
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
        System.out.println();
    }

    public void sCaracter6(int numCaracteres) {
        System.out.println("Serie caracter 6");
        for (int fila = 0; fila < numCaracteres; fila++) {
            char caracter = (char) (fila + 'a');
            System.out.print(caracter + " ");
        }
        System.out.println();

    }

    public void sCaracter6dos(int numCaracteres) {
        System.out.println("Serie Caracter 6.1 ");
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
        System.out.println();
    }

    public void sCaracter7(int numCaracteres) {
        System.out.println("Serie caracter 7");
        for (int fila = 1; fila <= numCaracteres; fila++) {
            char vocal = (char) ('a' + (fila - 1));
            String mLetra = Character.toString(vocal);
            System.out.print(mLetra.repeat(fila * 2) + " ");
        }
        System.out.println();
    }

    public void serieCaracter8(int nivel) {
        System.out.println("Serie caracter 8");
        int numeroInpar;
        String letra;
        for (int i = 0; i < nivel; i++) {
            char simbolo = (char) ('a' + i);
            numeroInpar = (i * 2) + 1;
            letra = Character.toString(simbolo);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(letra.repeat(numeroInpar) + " ");
        }
        System.out.println();

    }

}
