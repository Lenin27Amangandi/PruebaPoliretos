package leninPoliretos;

public class figurasL {

    public void figura2(int nroNiveles){
        System.out.println("Figura 2");
        for (int i = 0; i < nroNiveles; i++) {
            for (int j = 0; j < nroNiveles; j++) {
                if (i == 0 || i == nroNiveles - 1 || j == 0 || j == nroNiveles - 1) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void figura3Lenin(int nivel) {
        System.out.println("Figura N3");
        for (int fila = 1; fila <= nivel; fila++) {
            System.out.println("* ".repeat(fila));
        }
    }

    public void figura4Lenin(int nivel) {
        System.out.println("Figura N4");
        for (int fila = nivel - 1, j = 1; 0 <= fila && j <= nivel; fila--, j++) {
            System.out.println("  ".repeat(fila) + "* ".repeat(j));

            // System.out.print(" ".repeat(nivel - fila));
            // System.out.print("* ".repeat(fila));
            // System.out.println();
        }
    }

    public void figura5(int nivel, char caracter) {
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

    public void figura6Lenin(int nivel) {
        System.out.println("Figura N6");
        for (int fila = 1; fila <= nivel; fila++) {
            System.out.println(" ".repeat(nivel - fila) + "* ".repeat(fila));
        }
    }

    public void imprimirFigura7(int nroNiveles) {
        System.out.println("Figura 7");
        for (int i = 1; i <= nroNiveles; i++) {
            int espacios = i - 1;
            System.out.print("  ".repeat(espacios));
            if (i % 2 != 0) {
                System.out.print("-".repeat(3));
            } else {
                System.out.print(" |");
            }
            System.out.println();
        }
    }

    public void figura8(int nroNiveles) {
        System.out.println("Figura 8");
        for (int i = nroNiveles, j = 1; i >= 1 && j <= nroNiveles; i--, j++) {
            int espacios = i - 1;
            System.out.print("  ".repeat(espacios));
            if (j % 2 != 0) {
                System.out.print("-".repeat(3));
            } else {
                System.out.print(" |");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void g1_crearFigura9(int tamanio) {
        System.out.println("Figura 9:");
        int aux1 = (tamanio - 1) * 4, aux2 = 3;
        String cadenaGuion = "___";
        for (int fila = 0; fila < tamanio; fila++) {
            for (int espaciosIzq = 0; espaciosIzq < aux1; espaciosIzq++) {
                System.out.print(" ");
            }
            if (fila == 0) {
                System.out.println(cadenaGuion);
                aux1 -= 4;
            }
            if (fila > 0) {
                System.out.print(cadenaGuion + "|");
                aux1 -= 4;
                for (int espaciosInternos = 0; espaciosInternos < aux2; espaciosInternos++) {
                    System.out.print(" ");
                }
                System.out.println("|" + cadenaGuion);
                aux2 += 8;
            }
        }
        System.out.println();
    }

    public void figura12Lenin(int nivel) {
        System.out.println("Figura N12");
        for (int fila = nivel; 0 < fila; fila--) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }

    public void figura13Lenin(int nivel) {
        System.out.println("Figura N13");
        for (int fila = 0; fila <= nivel; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }

    public void figura16(int nroNiveles) {
        System.out.println("Figura N16");
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

    public void figura17(int nivel) {
        System.out.println("Figura N17");

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

}
