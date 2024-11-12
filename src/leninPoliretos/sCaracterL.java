package leninPoliretos;

public class sCaracterL {

    public void sCaracter6(int numCaracteres) {
        System.out.println("Serie caracter 6");
        for (int fila = 0; fila < numCaracteres; fila++) {
            char caracter = (char) (fila + 'a');
            System.out.print(caracter + " ");
        }
    }

    public void sCaracter6dos(int numCaracteres) {
        System.out.println("Serie Caracter 6");
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

    public void sCaracter7(int numCaracteres) {
        System.out.println("Serie caracter 7");
        for (int fila = 1; fila <= numCaracteres; fila++) {
            char vocal = (char) ('a' + (fila - 1));
            String mLetra = Character.toString(vocal);
            System.out.print(mLetra.repeat(fila * 2) + " ");
        }
    }

}
